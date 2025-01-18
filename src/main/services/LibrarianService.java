package main.services;

import main.entities.Librarian;
import main.repositories.LibrarianRepository;

import java.util.List;

/**
 * This is the LibrarianService class.
 * Detailed description of the class.
 */
/**
 * Represents the LibrarianService class.
 * This class is responsible for managing librarianservice entities and logic.
 */
public class LibrarianService {
    private final LibrarianRepository librarianRepository;

/**
 * public LibrarianService(LibrarianRepository librarianRepository) {
 * Detailed description of the method.
 */
/**
 * public LibrarianService(LibrarianRepository librarianRepository)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public LibrarianService(LibrarianRepository librarianRepository) {
        this.librarianRepository = librarianRepository;
    }

/**
 * public List<Librarian> getAllLibrarians() {
 * Detailed description of the method.
 */
/**
 * public List<Librarian> getAllLibrarians()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public List<Librarian> getAllLibrarians() {
        return librarianRepository.getAllLibrarians();
    }

/**
 * public Librarian getLibrarianById(long id) {
 * Detailed description of the method.
 */
/**
 * public Librarian getLibrarianById(long id)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Librarian getLibrarianById(long id) {
        return librarianRepository.getLibrarianById(id);
    }

/**
 * public void updateLibrarian(Librarian librarian) {
 * Detailed description of the method.
 */
/**
 * public void updateLibrarian(Librarian librarian)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void updateLibrarian(Librarian librarian) {
        librarianRepository.updateLibrarian(librarian);
    }

/**
 * public void addLibrarian(Librarian librarian) {
 * Detailed description of the method.
 */
/**
 * public void addLibrarian(Librarian librarian)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void addLibrarian(Librarian librarian) {
        librarianRepository.saveLibrarian(librarian);
    }

/**
 * public void deleteLibrarian(Long librarianId) {
 * Detailed description of the method.
 */
/**
 * public void deleteLibrarian(Long librarianId)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void deleteLibrarian(Long librarianId) {
        librarianRepository.deleteLibrarian(librarianId);
    }
}
