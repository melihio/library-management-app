package main.repositories;

import main.entities.Librarian;
import main.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * This is the LibrarianRepository class.
 * Detailed description of the class.
 */
/**
 * Represents the LibrarianRepository class.
 * This class is responsible for managing librarianrepository entities and logic.
 */
public class LibrarianRepository {

    // Get all librarians
/**
 * public List<Librarian> getAllLibrarians() {
 * Detailed description of the method.
 */
/**
 * public List<Librarian> getAllLibrarians()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public List<Librarian> getAllLibrarians() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Librarian", Librarian.class).list();
        }
    }

    // Get a librarian by ID
/**
 * public Librarian getLibrarianById(long id) {
 * Detailed description of the method.
 */
/**
 * public Librarian getLibrarianById(long id)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Librarian getLibrarianById(long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Librarian WHERE id = :id", Librarian.class)
                    .setParameter("id", id)
                    .uniqueResult();
        }
    }

    // Save a new librarian
/**
 * public void saveLibrarian(Librarian librarian) {
 * Detailed description of the method.
 */
/**
 * public void saveLibrarian(Librarian librarian)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void saveLibrarian(Librarian librarian) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(librarian);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw e;
        }
    }

    // Update an existing librarian
/**
 * public void updateLibrarian(Librarian librarian) {
 * Detailed description of the method.
 */
/**
 * public void updateLibrarian(Librarian librarian)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void updateLibrarian(Librarian librarian) {
        Transaction transaction;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(librarian);
            transaction.commit();
        }
    }

    // Delete a librarian by ID
/**
 * public void deleteLibrarian(Long librarianId) {
 * Detailed description of the method.
 */
/**
 * public void deleteLibrarian(Long librarianId)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void deleteLibrarian(Long librarianId) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Librarian librarian = session.get(Librarian.class, librarianId);
            if (librarian != null) {
                session.delete(librarian);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw e;
        }
    }
}
