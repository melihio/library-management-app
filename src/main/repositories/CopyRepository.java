package main.repositories;

import main.entities.Book;
import main.entities.Copy;
import main.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * This is the CopyRepository class.
 * Detailed description of the class.
 */
/**
 * Represents the CopyRepository class.
 * This class is responsible for managing copyrepository entities and logic.
 */
public class CopyRepository {


/**
 * public List<Copy> getAllCopies() {
 * Detailed description of the method.
 */
/**
 * public List<Copy> getAllCopies()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 * @return List<Copy>
 */
    public List<Copy> getAllCopies() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Copy", Copy.class).list();
        }
    }

/**
 * public Copy getCopyById(long id) {
 * Detailed description of the method.
 */
/**
 * public Copy getCopyById(long id)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Copy getCopyById(long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Copy WHERE id = :id", Copy.class)
                    .setParameter("id", id)
                    .uniqueResult();
        }
    }

/**
 * public void updateCopy(Copy copy) {
 * Detailed description of the method.
 */
/**
 * public void updateCopy(Copy copy)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void updateCopy(Copy copy) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(copy);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Error updating copy in database", e);
        } finally {
            session.close();
        }
    }

/**
 * public void saveCopy(Copy copy) {
 * Detailed description of the method.
 */
/**
 * public void saveCopy(Copy copy)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void saveCopy(Copy copy) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(copy);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw e;
        }
    }

/**
 * public void deleteCopy(Long copyId) {
 * Detailed description of the method.
 */
/**
 * public void deleteCopy(Long copyId)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void deleteCopy(Long copyId) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Copy copy = session.get(Copy.class, copyId);
            if (copy != null) {
                session.delete(copy);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw e;
        }
    }
}