package main.repositories;

import main.entities.Book;
import main.entities.Publisher;
import main.managers.GeneralManager;
import main.services.BookService;
import main.services.BorrowingService;
import main.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * This is the PublisherRepository class.
 * Detailed description of the class.
 */
/**
 * Represents the PublisherRepository class.
 * This class is responsible for managing publisherrepository entities and logic.
 */
public class PublisherRepository {
/**
 * public List<Publisher> getAllPublishers() {
 * Detailed description of the method.
 */
/**
 * public List<Publisher> getAllPublishers()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public List<Publisher> getAllPublishers() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Publisher", Publisher.class).list();
        }
    }

/**
 * public Publisher getPublisherById(long id) {
 * Detailed description of the method.
 */
/**
 * public Publisher getPublisherById(long id)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Publisher getPublisherById(long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Publisher WHERE id = :id", Publisher.class)
                    .setParameter("id", id)
                    .uniqueResult();
        }
    }

/**
 * public void updatePublisher(Publisher publisher) {
 * Detailed description of the method.
 */
/**
 * public void updatePublisher(Publisher publisher)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void updatePublisher(Publisher publisher) {
        Transaction transaction;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(publisher);
            transaction.commit();
        }
    }

/**
 * public void savePublisher(Publisher publisher) {
 * Detailed description of the method.
 */
/**
 * public void savePublisher(Publisher publisher)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void savePublisher(Publisher publisher) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(publisher);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw e;
        }
    }

/**
 * public void deletePublisher(Long publisherId) {
 * Detailed description of the method.
 */
/**
 * public void deletePublisher(Long publisherId)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void deletePublisher(Long publisherId) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Publisher publisher = session.get(Publisher.class, publisherId);
            if (publisher != null) {
                session.delete(publisher);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw e;
        }
    }
}