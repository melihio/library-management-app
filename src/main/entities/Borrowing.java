package main.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Borrowings")
/**
 * This is the Borrowing class.
 * Detailed description of the class.
 */
/**
 * Represents the Borrowing class.
 * This class is responsible for managing borrowing entities and logic.
 */
public class Borrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "copy_id")
    private Copy copy;

    @Column(nullable = false)
    private LocalDateTime borrowDate;

    @Column
    private LocalDateTime returnDate;

/**
 * public Borrowing() {}
 * Detailed description of the method.
 */
/**
 * public Borrowing()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Borrowing() {}

/**
 * public Borrowing(User user, Copy copy, LocalDateTime borrowDate, LocalDateTime returnDate) {
 * Detailed description of the method.
 */
/**
 * public Borrowing(User user, Copy copy, LocalDateTime borrowDate, LocalDateTime returnDate)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Borrowing(User user, Copy copy, LocalDateTime borrowDate, LocalDateTime returnDate) {
        this.user = user;
        this.copy = copy;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

/**
 * public Long getId() {
 * Detailed description of the method.
 */
/**
 * public Long getId()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Long getId() {
        return id;
    }

/**
 * public void setId(Long id) {
 * Detailed description of the method.
 */
/**
 * public void setId(Long id)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setId(Long id) {
        this.id = id;
    }

/**
 * public User getUser() {
 * Detailed description of the method.
 */
/**
 * public User getUser()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public User getUser() {
        return user;
    }

/**
 * public void setUser(User user) {
 * Detailed description of the method.
 */
/**
 * public void setUser(User user)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setUser(User user) {
        this.user = user;
    }

/**
 * public Copy getCopy() {
 * Detailed description of the method.
 */
/**
 * public Copy getCopy()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Copy getCopy() {
        return copy;
    }

/**
 * public void setCopy(Copy copy) {
 * Detailed description of the method.
 */
/**
 * public void setCopy(Copy copy)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setCopy(Copy copy) {
        this.copy = copy;
    }

/**
 * public LocalDateTime getBorrowDate() {
 * Detailed description of the method.
 */
/**
 * public LocalDateTime getBorrowDate()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

/**
 * public void setBorrowDate(LocalDateTime borrowDate) {
 * Detailed description of the method.
 */
/**
 * public void setBorrowDate(LocalDateTime borrowDate)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setBorrowDate(LocalDateTime borrowDate) {
        this.borrowDate = borrowDate;
    }

/**
 * public LocalDateTime getReturnDate() {
 * Detailed description of the method.
 */
/**
 * public LocalDateTime getReturnDate()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public LocalDateTime getReturnDate() {
        return returnDate;
    }

/**
 * public void setReturnDate(LocalDateTime returnDate) {
 * Detailed description of the method.
 */
/**
 * public void setReturnDate(LocalDateTime returnDate)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }
}
