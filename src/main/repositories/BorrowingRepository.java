package main.repositories;

import main.entities.Book;
import main.entities.Borrowing;
import main.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDateTime;
import java.util.List;

/**
 * This is the BorrowingRepository class.
 * Detailed description of the class.
 */
/**
 * Represents the BorrowingRepository class.
 * This class is responsible for managing borrowingrepository entities and logic.
 */
public class BorrowingRepository {
/**
 * public List<Borrowing> getAllBorrowings() {
 * Detailed description of the method.
 */
/**
 * public List<Borrowing> getAllBorrowings()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public List<Borrowing> getAllBorrowings() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Borrowing", Borrowing.class).list();
        }
    }

/**
 * public void updateBorrowing(Borrowing borrowing) {
 * Detailed description of the method.
 */
/**
 * public void updateBorrowing(Borrowing borrowing)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void updateBorrowing(Borrowing borrowing) {
        Transaction transaction;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(borrowing);
            transaction.commit();
        }
    }

/**
 * public void saveBorrowing(Borrowing borrowing) {
 * Detailed description of the method.
 */
/**
 * public void saveBorrowing(Borrowing borrowing)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void saveBorrowing(Borrowing borrowing) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(borrowing);
            transaction.commit();
            System.out.println("worked");
        } catch (Exception e) {
            System.out.println("nah");
            if (transaction != null) {
                transaction.rollback();
            }
            throw e;
        }
    }

/**
 * public void deleteBorrowing(Long borrowingId) {
 * Detailed description of the method.
 */
/**
 * public void deleteBorrowing(Long borrowingId)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void deleteBorrowing(Long borrowingId) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Borrowing borrowing = session.get(Borrowing.class, borrowingId);
            if (borrowing != null) {
                session.delete(borrowing);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw e;
        }
    }
}
