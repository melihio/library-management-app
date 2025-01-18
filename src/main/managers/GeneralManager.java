package main.managers;

import main.repositories.*;
import main.services.*;

/**
 * This is the GeneralManager class.
 * Detailed description of the class.
 */
/**
 * Represents the GeneralManager class.
 * This class is responsible for managing generalmanager entities and logic.
 */
public class GeneralManager {
    private static GeneralManager instance;

    private BookService bookService;
    private PublisherService publisherService;
    private BorrowingService borrowingService;
    private UserService userService;
    private CopyService copyService;
    private LibrarianService librarianService;

    private GeneralManager() {
        // Initialize repositories
        BookRepository bookRepository = new BookRepository();
        PublisherRepository publisherRepository = new PublisherRepository();
        BorrowingRepository borrowingRepository = new BorrowingRepository();
        UserRepository userRepository = new UserRepository();
        CopyRepository copyRepository = new CopyRepository();
        LibrarianRepository librarianRepository = new LibrarianRepository();

        // Initialize services
        bookService = new BookService(bookRepository);
        publisherService = new PublisherService(publisherRepository);
        borrowingService = new BorrowingService(borrowingRepository);
        userService = new UserService(userRepository);
        copyService = new CopyService(copyRepository);
        librarianService = new LibrarianService(librarianRepository);
    }

/**
 * public static GeneralManager getInstance() {
 * Detailed description of the method.
 */
/**
 * public static GeneralManager getInstance()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public static GeneralManager getInstance() {
        if (instance == null) {
            instance = new GeneralManager();
        }
        return instance;
    }

/**
 * public BookService getBookService() {
 * Detailed description of the method.
 */
/**
 * public BookService getBookService()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public BookService getBookService() {
        return bookService;
    }

/**
 * public PublisherService getPublisherService() {
 * Detailed description of the method.
 */
/**
 * public PublisherService getPublisherService()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public PublisherService getPublisherService() {
        return publisherService;
    }

/**
 * public BorrowingService getBorrowingService() {
 * Detailed description of the method.
 */
/**
 * public BorrowingService getBorrowingService()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public BorrowingService getBorrowingService() {
        return borrowingService;
    }

/**
 * public UserService getUserService() { return userService; }
 * Detailed description of the method.
 */
/**
 * public UserService getUserService()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public UserService getUserService() { return userService; }

/**
 * public LibrarianService getLibrarianService() { return librarianService; }
 * Detailed description of the method.
 */
/**
 * public LibrarianService getLibrarianService()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public LibrarianService getLibrarianService() { return librarianService; }

/**
 * public CopyService getCopyService() {
 * Detailed description of the method.
 */
/**
 * public CopyService getCopyService()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public CopyService getCopyService() {
        return copyService;
    }
}
