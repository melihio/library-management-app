package test;

import main.entities.Publisher;
import main.managers.GeneralManager;
import main.services.PublisherService;
import org.junit.jupiter.api.*;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
/**
 * This is the PublisherTest class.
 * Detailed description of the class.
 */
/**
 * Represents the PublisherTest class.
 * This class is responsible for managing publishertest entities and logic.
 */
public class PublisherTest {

    private PublisherService publisherService;

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
        publisherService = GeneralManager.getInstance().getPublisherService();
    }

    @Test
/**
 * public void testAddPublisher() {
 * Detailed description of the method.
 */
/**
 * public void testAddPublisher()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testAddPublisher() {
        Publisher publisher = new Publisher("Filip Inc.", "idk", "123-456-7890");
        publisherService.addPublisher(publisher);
        Assertions.assertNotNull(publisherService.getPublisherById(publisher.getId()));
    }

    @Test
/**
 * public void testGetAllPublishers() {
 * Detailed description of the method.
 */
/**
 * public void testGetAllPublishers()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testGetAllPublishers() {
        List<Publisher> publishers = publisherService.getAllPublishers();
        Assertions.assertFalse(publishers.isEmpty());
    }

    @Test
/**
 * public void testUpdatePublisher() {
 * Detailed description of the method.
 */
/**
 * public void testUpdatePublisher()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testUpdatePublisher() {
        Publisher publisher = publisherService.getAllPublishers().getFirst();
        publisher.setName("Updated Penguin");
        publisherService.updatePublisher(publisher);
        Assertions.assertEquals("Updated Penguin", publisherService.getPublisherById(publisher.getId()).getName());
    }

    @Test
/**
 * public void testDeletePublisher() {
 * Detailed description of the method.
 */
/**
 * public void testDeletePublisher()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void testDeletePublisher() {
        Publisher publisher = new Publisher("Filip Test Inc.", "idk", "123-456-7890");
        publisherService.addPublisher(publisher);
        publisherService.deletePublisher(publisher.getId());
        Assertions.assertFalse(publisherService.getAllPublishers().contains(publisher));
    }
}
