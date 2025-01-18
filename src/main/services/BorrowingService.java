package main.services;

import main.entities.Borrowing;
import main.repositories.BorrowingRepository;

import java.util.List;

/**
 * This is the BorrowingService class.
 * Detailed description of the class.
 */
/**
 * Represents the BorrowingService class.
 * This class is responsible for managing borrowingservice entities and logic.
 */
public class BorrowingService {
    private BorrowingRepository borrowingRepository;

/**
 * public BorrowingService(BorrowingRepository borrowingRepository) {
 * Detailed description of the method.
 */
/**
 * public BorrowingService(BorrowingRepository borrowingRepository)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public BorrowingService(BorrowingRepository borrowingRepository) {
        this.borrowingRepository = borrowingRepository;
    }

/**
 * public Borrowing getBorrowingById(Long id) {
 * Detailed description of the method.
 */
/**
 * public Borrowing getBorrowingById(Long id)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Borrowing getBorrowingById(Long id) {
        return getAllBorrowings().stream().filter(b -> b.getId().equals(id)).findFirst().orElse(null);
    }

/**
 * public List<Borrowing> getAllBorrowings() {
 * Detailed description of the method.
 */
/**
 * public List<Borrowing> getAllBorrowings()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public List<Borrowing> getAllBorrowings() {
        return borrowingRepository.getAllBorrowings();
    }

/**
 * public void updateBorrowing(Borrowing borrowing) { borrowingRepository.updateBorrowing(borrowing); }
 * Detailed description of the method.
 */
/**
 * public void updateBorrowing(Borrowing borrowing)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void updateBorrowing(Borrowing borrowing) { borrowingRepository.updateBorrowing(borrowing); }

/**
 * public void addBorrowing(Borrowing borrowing) {
 * Detailed description of the method.
 */
/**
 * public void addBorrowing(Borrowing borrowing)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void addBorrowing(Borrowing borrowing) {
        borrowingRepository.saveBorrowing(borrowing);
    }

/**
 * public void deleteBorrowing(Long borrowingId) {
 * Detailed description of the method.
 */
/**
 * public void deleteBorrowing(Long borrowingId)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void deleteBorrowing(Long borrowingId) {
        borrowingRepository.deleteBorrowing(borrowingId);
    }
}