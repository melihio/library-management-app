package main.services;

import main.entities.Book;
import main.entities.Publisher;
import main.repositories.BookRepository;

import java.util.Arrays;
import java.util.List;

/**
 * This is the BookService class.
 * Detailed description of the class.
 */
/**
 * Represents the BookService class.
 * This class is responsible for managing bookservice entities and logic.
 */
public class BookService {
    private final BookRepository bookRepository;

/**
 * public BookService(BookRepository bookRepository) {
 * Detailed description of the method.
 */
/**
 * public BookService(BookRepository bookRepository)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

/**
 * public Book getBookById(Long id) { return bookRepository.getBookById(id); }
 * Detailed description of the method.
 */
/**
 * public Book getBookById(Long id)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Book getBookById(Long id) { return bookRepository.getBookById(id); }

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
        return bookRepository.getAllBooks();
    }

/**
 * public void addBook(Book book) {
 * Detailed description of the method.
 */
/**
 * public void addBook(Book book)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void addBook(Book book) {
        bookRepository.saveBook(book);
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
        bookRepository.deleteBook(bookId);
    }

/**
 * public void updateBook(Book book) { bookRepository.updateBook(book);}
 * Detailed description of the method.
 */
/**
 * public void updateBook(Book book)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void updateBook(Book book) { bookRepository.updateBook(book);}
}
