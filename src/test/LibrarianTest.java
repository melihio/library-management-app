package test;

import main.entities.Librarian;
import main.entities.User;
import main.managers.GeneralManager;
import main.services.LibrarianService;
import org.junit.jupiter.api.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
/**
 * This is the LibrarianTest class.
 * Detailed description of the class.
 */
/**
 * Represents the LibrarianTest class.
 * This class is responsible for managing librariantest entities and logic.
 */
public class LibrarianTest {

    private LibrarianService librarianService;
    private User user;
    private Librarian librarian;

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
        librarianService = GeneralManager.getInstance().getLibrarianService();

        user = new User("john.doe@example.com", "John Doe", "123 Main St", "1234567890");
        GeneralManager.getInstance().getUserService().addUser(user);

        LocalDate localDate = LocalDate.of(2022, 11, 15);
        Date sqlDate = Date.valueOf(localDate);

        librarian = new Librarian(user, sqlDate, "Head Librarian");
        librarianService.addLibrarian(librarian);
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
        librarianService.deleteLibrarian(librarian.getId());
        GeneralManager.getInstance().getUserService().deleteUser(user.getId());
    }

    @Test
/**
 * public void testAddLibrarian() {
 * Detailed description of the method.
 */
/**
 * public void testAddLibrarian()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testAddLibrarian() {
        Assertions.assertNotNull(librarianService.getLibrarianById(librarian.getId()));
    }

    @Test
/**
 * public void testGetAllLibrarians() {
 * Detailed description of the method.
 */
/**
 * public void testGetAllLibrarians()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testGetAllLibrarians() {
        List<Librarian> librarians = librarianService.getAllLibrarians();
        Assertions.assertFalse(librarians.isEmpty());
    }

    @Test
/**
 * public void testUpdateLibrarian() {
 * Detailed description of the method.
 */
/**
 * public void testUpdateLibrarian()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testUpdateLibrarian() {
        librarian.setPosition("Senior Librarian");
        librarianService.updateLibrarian(librarian);
        Assertions.assertEquals("Senior Librarian", librarianService.getLibrarianById(librarian.getId()).getPosition());
    }

    @Test
/**
 * public void testDeleteLibrarian() {
 * Detailed description of the method.
 */
/**
 * public void testDeleteLibrarian()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testDeleteLibrarian() {
        librarianService.deleteLibrarian(librarian.getId());
        Assertions.assertNull(librarianService.getLibrarianById(librarian.getId()));
    }
}
