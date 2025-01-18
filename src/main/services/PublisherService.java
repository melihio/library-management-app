package main.services;

import main.entities.Publisher;
import main.repositories.PublisherRepository;

import java.util.Arrays;
import java.util.List;

/**
 * This is the PublisherService class.
 * Detailed description of the class.
 */
/**
 * Represents the PublisherService class.
 * This class is responsible for managing publisherservice entities and logic.
 */
public class PublisherService {
    private final PublisherRepository publisherRepository;

/**
 * public PublisherService(PublisherRepository publisherRepository) {
 * Detailed description of the method.
 */
/**
 * public PublisherService(PublisherRepository publisherRepository)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

/**
 * public List<Publisher> getAllPublishers() {
 * Detailed description of the method.
 */
/**
 * public List<Publisher> getAllPublishers()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public List<Publisher> getAllPublishers() {
        return publisherRepository.getAllPublishers();
    }

/**
 * public Publisher getPublisherById(Long id) {
 * Detailed description of the method.
 */
/**
 * public Publisher getPublisherById(Long id)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Publisher getPublisherById(Long id) {
        return publisherRepository.getPublisherById(id);
    }

/**
 * public void addPublisher(Publisher publisher) {
 * Detailed description of the method.
 */
/**
 * public void addPublisher(Publisher publisher)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void addPublisher(Publisher publisher) {
        if(Arrays.stream(publisherRepository.getAllPublishers().toArray(new Publisher[0]))
                .filter(p -> p.getName().equals(publisher.getName())).count() > 0){
            throw new IllegalArgumentException("Publisher with that name already exists");
        }
        publisherRepository.savePublisher(publisher);
    }

/**
 * public void deletePublisher(Long publisherId) {
 * Detailed description of the method.
 */
/**
 * public void deletePublisher(Long publisherId)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void deletePublisher(Long publisherId) {
        publisherRepository.deletePublisher(publisherId);
    }

/**
 * public void updatePublisher(Publisher publisher) {
 * Detailed description of the method.
 */
/**
 * public void updatePublisher(Publisher publisher)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void updatePublisher(Publisher publisher) {
        publisherRepository.updatePublisher(publisher);
    }
}