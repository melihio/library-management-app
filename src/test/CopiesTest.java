package test;

import main.entities.Book;
import main.entities.Copy;
import main.entities.Publisher;
import main.managers.GeneralManager;
import main.services.CopyService;
import org.junit.jupiter.api.*;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
/**
 * This is the CopiesTest class.
 * Detailed description of the class.
 */
/**
 * Represents the CopiesTest class.
 * This class is responsible for managing copiestest entities and logic.
 */
public class CopiesTest {
    private int id = 0;

    private CopyService copyService;
    private Publisher publisher;
    private Book book;

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
        copyService = GeneralManager.getInstance().getCopyService();

        publisher = new Publisher("MrBeast Publishing", "Test Address", "123456789");
        GeneralManager.getInstance().getPublisherService().addPublisher(publisher);

        book = new Book("Test Book", "Test Author", publisher, 2010, "9781234567890");
        GeneralManager.getInstance().getBookService().addBook(book);
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
        GeneralManager.getInstance().getBookService().deleteBook(book.getId());
        GeneralManager.getInstance().getPublisherService().deletePublisher(publisher.getId());
    }

    @Test
    @Order(1)
/**
 * public void testAddCopy() {
 * Detailed description of the method.
 */
/**
 * public void testAddCopy()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testAddCopy() {
        Copy copy = new Copy(book, id++,"Borrowed");
        copyService.addCopy(copy);

        Assertions.assertNotNull(copyService.getCopyById(copy.getId()));
    }

    @Test
    @Order(2)
/**
 * public void testGetAllCopies() {
 * Detailed description of the method.
 */
/**
 * public void testGetAllCopies()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testGetAllCopies() {
        Copy copy = new Copy(book, id++,"Borrowed");
        copyService.addCopy(copy);

        List<Copy> copies = copyService.getAllCopies();
        Assertions.assertFalse(copies.isEmpty());
    }

    @Test
    @Order(3)
/**
 * public void testUpdateCopy() {
 * Detailed description of the method.
 */
/**
 * public void testUpdateCopy()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testUpdateCopy() {
        Copy copy = new Copy(book, 120, "Borrowed");
        copyService.addCopy(copy);
        copy.setStatus("Available");

        copyService.updateCopy(copy);

        Assertions.assertEquals("Available", copyService.getCopyById(copy.getId()).getStatus());
    }

    @Test
    @Order(4)
/**
 * public void testDeleteCopy() {
 * Detailed description of the method.
 */
/**
 * public void testDeleteCopy()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testDeleteCopy() {
        Copy copy = new Copy(book, id++, "Borrowed");
        copyService.addCopy(copy);

        copyService.deleteCopy(copy.getId());

        Assertions.assertNull(copyService.getCopyById(copy.getId()));
    }
}
