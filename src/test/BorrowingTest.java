package test;

import main.entities.*;
import main.managers.GeneralManager;
import main.services.BorrowingService;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
/**
 * This is the BorrowingTest class.
 * Detailed description of the class.
 */
/**
 * Represents the BorrowingTest class.
 * This class is responsible for managing borrowingtest entities and logic.
 */
public class BorrowingTest {
    private int id = 0;
    private BorrowingService borrowingService;
    private User user;
    private Copy copy;
    Publisher publisher;
    Book book;
    LocalDateTime borrowTime = LocalDateTime.now();
    LocalDateTime returnTime = borrowTime.plusDays(14);

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
        borrowingService = GeneralManager.getInstance().getBorrowingService();

        publisher = new Publisher("Moonlight Press", "12 Crescent Road, Mysteria", "987654321");
        book = new Book("Echoes of Eternity", "Sylvia Nightshade", publisher, 2015, "978-1-234567-890");
        user = new User("Luna Astralis", "luna.astralis@fictional.com", "password123", "Starlight Lane, Celestia");
        copy = new Copy(book, id++, "Borrowed");

        GeneralManager.getInstance().getUserService().addUser(user);
        GeneralManager.getInstance().getPublisherService().addPublisher(publisher);
        GeneralManager.getInstance().getBookService().addBook(book);
        GeneralManager.getInstance().getCopyService().addCopy(copy);
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
        // Remove Borrowings linked to the Copy
        List<Borrowing> borrowings = borrowingService.getAllBorrowings();
        for (Borrowing borrowing : borrowings) {
            borrowingService.deleteBorrowing(borrowing.getId());
        }

        // Remove Copy
        GeneralManager.getInstance().getCopyService().deleteCopy(copy.getId());

        // Remove Book, Publisher, and User if no dependencies exist
        GeneralManager.getInstance().getBookService().deleteBook(book.getId());
        GeneralManager.getInstance().getPublisherService().deletePublisher(publisher.getId());
        GeneralManager.getInstance().getUserService().deleteUser(user.getId());
    }


    @Test
/**
 * public void testAddBorrowing() {
 * Detailed description of the method.
 */
/**
 * public void testAddBorrowing()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testAddBorrowing() {
        LocalDateTime borrowTime = LocalDateTime.now(); // Current date and time
        LocalDateTime returnTime = borrowTime.plusDays(14);
        Borrowing borrowing = new Borrowing(user,copy,borrowTime,returnTime.plusDays(3));
        borrowingService.addBorrowing(borrowing);
        Assertions.assertNotNull(borrowingService.getBorrowingById(borrowing.getId()));
    }

    @Test
/**
 * public void testGetAllBorrowings() {
 * Detailed description of the method.
 */
/**
 * public void testGetAllBorrowings()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testGetAllBorrowings() {
        Borrowing borrowing = new Borrowing(user,copy,borrowTime,returnTime.plusDays(3));
        borrowingService.addBorrowing(borrowing);
        List<Borrowing> borrowings = borrowingService.getAllBorrowings();
        Assertions.assertFalse(borrowings.isEmpty());
    }

    @Test
/**
 * public void testUpdateBorrowing() {
 * Detailed description of the method.
 */
/**
 * public void testUpdateBorrowing()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testUpdateBorrowing() {
        Borrowing borrowing = new Borrowing(user,copy,borrowTime,returnTime.plusDays(3));
        borrowingService.addBorrowing(borrowing);
        borrowingService.updateBorrowing(borrowing);
        Assertions.assertEquals(returnTime.plusDays(3), borrowingService.getBorrowingById(borrowing.getId()).getReturnDate());
    }

    @Test
/**
 * public void testDeleteBorrowing() {
 * Detailed description of the method.
 */
/**
 * public void testDeleteBorrowing()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testDeleteBorrowing() {
        Borrowing borrowing = new Borrowing(user,copy,borrowTime,returnTime);
        borrowingService.addBorrowing(borrowing);
        borrowingService.deleteBorrowing(user.getId());
        Assertions.assertFalse(borrowingService.getAllBorrowings().contains(user));
    }
}
