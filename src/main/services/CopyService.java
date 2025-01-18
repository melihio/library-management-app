package main.services;

import main.entities.Copy;
import main.managers.GeneralManager;
import main.repositories.CopyRepository;
import main.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Arrays;
import java.util.List;

/**
 * This is the CopyService class.
 * Detailed description of the class.
 */
/**
 * Represents the CopyService class.
 * This class is responsible for managing copyservice entities and logic.
 */
public class CopyService {
    private final CopyRepository copyRepository;

/**
 * public CopyService(CopyRepository copyRepository) {
 * Detailed description of the method.
 */
/**
 * public CopyService(CopyRepository copyRepository)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public CopyService(CopyRepository copyRepository) {
        this.copyRepository = copyRepository;
    }

/**
 * public List<Copy> getAllCopies() {
 * Detailed description of the method.
 */
/**
 * public List<Copy> getAllCopies()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public List<Copy> getAllCopies() {
        return copyRepository.getAllCopies();
    }

/**
 * public List<Copy> getAvailableCopies()
 * Return all available Copy instances in database
 */
    public List<Copy> getAvailableCopies() {
        return Arrays.stream(getAllCopies().toArray(new Copy[0]))
                .filter(c -> c.getStatus().equals("Available"))
                .toList();
    }

/**
 * public Copy getCopyById(long id)
 * Returns the Copy that has the given Id
 */
    public Copy getCopyById(long id) { return copyRepository.getCopyById(id); }

/**
 * public void updateCopy(Copy copy)
 * It replaces the existing Copy instance in database with the given one.
 */
    public void updateCopy(Copy copy) { copyRepository.updateCopy(copy); }

/**
 * public void addCopy(Copy copy)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void addCopy(Copy copy) {
        copyRepository.saveCopy(copy);
    }

/**
 * public void deleteCopy(Long copyId) {
 * Detailed description of the method.
 */
/**
 * public void deleteCopy(Long copyId)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void deleteCopy(Long copyId) {
        copyRepository.deleteCopy(copyId);
    }
}