package test;

import main.entities.*;
import main.managers.GeneralManager;
import main.services.*;
import org.junit.jupiter.api.*;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
/**
 * This is the UserTest class.
 * Detailed description of the class.
 */
/**
 * Represents the UserTest class.
 * This class is responsible for managing usertest entities and logic.
 */
public class UserTest {

    private UserService userService;

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
        userService = GeneralManager.getInstance().getUserService();
    }

    @Test
/**
 * public void testAddUser() {
 * Detailed description of the method.
 */
/**
 * public void testAddUser()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testAddUser() {
        User user = new User("Teeeesst","testetestset@gmail.com","123459","testaddress");
        userService.addUser(user);
        Assertions.assertNotNull(userService.getUserById(user.getId()));
    }

    @Test
/**
 * public void testGetAllUsers() {
 * Detailed description of the method.
 */
/**
 * public void testGetAllUsers()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testGetAllUsers() {
        List<User> publishers = userService.getAllUsers();
        Assertions.assertFalse(publishers.isEmpty());
    }

    @Test
/**
 * public void testUpdateUser() {
 * Detailed description of the method.
 */
/**
 * public void testUpdateUser()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testUpdateUser() {
        User user = userService.getAllUsers().getFirst();
        user.setName("Updated Penguin");
        userService.updateUser(user);
        Assertions.assertEquals("Updated Penguin", userService.getUserById(user.getId()).getName());
    }

    @Test
/**
 * public void testDeleteUser() {
 * Detailed description of the method.
 */
/**
 * public void testDeleteUser()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testDeleteUser() {
        User user = new User("Teeeesst","testeasdasf@gmail.com","123459","testaddress");
        userService.addUser(user);
        userService.deleteUser(user.getId());
        Assertions.assertFalse(userService.getAllUsers().contains(user));
    }
}
