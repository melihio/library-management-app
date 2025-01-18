package main.repositories;

import main.entities.Book;
import main.entities.User;
import main.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * This is the UserRepository class.
 * Detailed description of the class.
 */
/**
 * Represents the UserRepository class.
 * This class is responsible for managing userrepository entities and logic.
 */
public class UserRepository {
/**
 * public List<User> getAllUsers() {
 * Detailed description of the method.
 */
/**
 * public List<User> getAllUsers()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public List<User> getAllUsers() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM User", User.class).list();
        }
    }

/**
 * public User getUserById(long id) {
 * Detailed description of the method.
 */
/**
 * public User getUserById(long id)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public User getUserById(long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM User WHERE id = :id", User.class)
                    .setParameter("id", id)
                    .uniqueResult();
        }
    }
/**
 * public User getUserByEmail(String email)
 * Detailed description of the method.
 */
/**
 * public User getUserByEmail(String email)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public User getUserByEmail(String email) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM User WHERE email = :email", User.class)
                    .setParameter("email", email)
                    .uniqueResult();
        }
    }

/**
 * public void updateUser(User user) {
 * Detailed description of the method.
 */
/**
 * public void updateUser(User user)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void updateUser(User user) {
        Transaction transaction;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();
        }
    }

/**
 * public void saveUser(User user) {
 * Detailed description of the method.
 */
/**
 * public void saveUser(User user)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void saveUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw e;
        }
    }

/**
 * public void deleteUser(Long userId) {
 * Detailed description of the method.
 */
/**
 * public void deleteUser(Long userId)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void deleteUser(Long userId) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            User user = session.get(User.class, userId);
            if (user != null) {
                session.delete(user);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw e;
        }
    }
}