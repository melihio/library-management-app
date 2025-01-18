package test;

import main.entities.Book;
import main.entities.Publisher;
import main.managers.GeneralManager;
import main.services.BookService;
import org.junit.jupiter.api.*;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
/**
 * This is the BookTest class.
 * Detailed description of the class.
 */
/**
 * Represents the BookTest class.
 * This class is responsible for managing booktest entities and logic.
 */
public class BookTest {

    private BookService bookService;
    private Publisher publisher;

    @BeforeEach
/**
 * public void setup() {
 * Detailed description of the method.
 */
/**
 * public void setup()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setup() {
        bookService = GeneralManager.getInstance().getBookService();
        publisher = new Publisher("mrbeast","test_adress","12345679");
        GeneralManager.getInstance().getPublisherService().addPublisher(publisher);
    }
    @AfterEach
/**
 * public void teardown() {
 * Detailed description of the method.
 */
/**
 * public void teardown()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void teardown() {
        GeneralManager.getInstance().getPublisherService().deletePublisher(publisher.getId());
    }

    @Test
/**
 * public void testAddBook() {
 * Detailed description of the method.
 */
/**
 * public void testAddBook()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testAddBook() {
        Book book = new Book("Title", "Author", publisher, 2010, "98124125");
        bookService.addBook(book);
        Assertions.assertNotNull(bookService.getBookById(book.getId()));
    }

    @Test
/**
 * public void testGetAllBooks() {
 * Detailed description of the method.
 */
/**
 * public void testGetAllBooks()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testGetAllBooks() {
        List<Book> publishers = bookService.getAllBooks();
        Assertions.assertFalse(publishers.isEmpty());
    }

    @Test
/**
 * public void testUpdateBook() {
 * Detailed description of the method.
 */
/**
 * public void testUpdateBook()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testUpdateBook() {
        Book book = bookService.getAllBooks().getFirst();
        book.setTitle("Updated Penguin");
        bookService.updateBook(book);
        Assertions.assertEquals("Updated Penguin", bookService.getBookById(book.getId()).getTitle());
    }

    @Test
/**
 * public void testDeleteBook() {
 * Detailed description of the method.
 */
/**
 * public void testDeleteBook()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testDeleteBook() {
        Book book = new Book("Title", "Author", publisher, 2010, "1234446789");
        bookService.addBook(book);
        bookService.deleteBook(book.getId());
        Assertions.assertFalse(bookService.getAllBooks().contains(book));
    }
}
