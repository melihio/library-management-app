package main.repositories;

import main.entities.Book;
import main.entities.Publisher;
import main.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * This is the BookRepository class.
 * Detailed description of the class.
 */
/**
 * Represents the BookRepository class.
 * This class is responsible for managing bookrepository entities and logic.
 */
public class BookRepository {
/**
 * public List<Book> getAllBooks() {
 * Detailed description of the method.
 */
/**
 * public List<Book> getAllBooks()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public List<Book> getAllBooks() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Book", Book.class).list();
        }
    }

/**
 * public Book getBookById(long id) {
 * Detailed description of the method.
 */
/**
 * public Book getBookById(long id)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Book getBookById(long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Book WHERE id = :id", Book.class)
                    .setParameter("id", id)
                    .uniqueResult();
        }
    }

/**
 * public void updateBook(Book book) {
 * Detailed description of the method.
 */
/**
 * public void updateBook(Book book)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void updateBook(Book book) {
        Transaction transaction;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(book);
            transaction.commit();
        }
    }

/**
 * public void saveBook(Book book) {
 * Detailed description of the method.
 */
/**
 * public void saveBook(Book book)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void saveBook(Book book) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw e;
        }
    }

/**
 * public void deleteBook(Long bookId) {
 * Detailed description of the method.
 */
/**
 * public void deleteBook(Long bookId)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void deleteBook(Long bookId) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Book book = session.get(Book.class, bookId);
            if (book != null) {
                session.delete(book);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw e;
        }
    }
}
