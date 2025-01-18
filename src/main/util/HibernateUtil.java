package main.util;

import main.entities.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

/**
 * This is the HibernateUtil class.
 * Detailed description of the class.
 */
/**
 * Represents the HibernateUtil class.
 * This class is responsible for managing hibernateutil entities and logic.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration config = new Configuration();
            config.setProperty("hibernate.hbm2ddl.auto", "update");
            config.setProperty("hibernate.connection.driver_class", "org.h2.Driver");
            config.setProperty("hibernate.connection.url", "jdbc:h2:file:/Users/melihcokan/Documents/projectDB");
            config.setProperty("hibernate.connection.username", "");
            config.setProperty("hibernate.connection.password", "");
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");

            config.addAnnotatedClass(User.class);
            config.addAnnotatedClass(Book.class);
            config.addAnnotatedClass(Borrowing.class);
            config.addAnnotatedClass(Copy.class);
            config.addAnnotatedClass(Librarian.class);
            config.addAnnotatedClass(Publisher.class);

            sessionFactory = config.buildSessionFactory();
        } catch (Exception e) {
            throw new RuntimeException("Error building SessionFactory", e);
        }
    }

/**
 * public static SessionFactory getSessionFactory() {
 * Detailed description of the method.
 */
/**
 * public static SessionFactory getSessionFactory()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
