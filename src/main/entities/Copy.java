package main.entities;

import javax.persistence.*;

@Entity
@Table(name = "Copies")
/**
 * This is the Copy class.
 * Detailed description of the class.
 */
/**
 * Represents the Copy class.
 * This class is responsible for managing copy entities and logic.
 */
public class Copy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private int copyNumber;

    private String status;

/**
 * public Copy() {}
 * Detailed description of the method.
 */
/**
 * public Copy()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Copy() {}

/**
 * public Copy(Book book, int copyNumber, String status) {
 * Detailed description of the method.
 */
/**
 * public Copy(Book book, int copyNumber, String status)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Copy(Book book, int copyNumber, String status) {
        this.book = book;
        this.copyNumber = copyNumber;
        this.status = status;
    }

    @Override
/**
 * public String toString() {
 * Detailed description of the method.
 */
/**
 * public String toString()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public String toString() {
        return this.getBook().getTitle() + "-" + this.getCopyNumber();
    }

    // Getters and Setters
/**
 * public Long getId() { return id; }
 * Detailed description of the method.
 */
/**
 * public Long getId()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Long getId() { return id; }

/**
 * public Book getBook() { return book; }
 * Detailed description of the method.
 */
/**
 * public Book getBook()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Book getBook() { return book; }
/**
 * public void setBook(Book book) { this.book = book; }
 * Detailed description of the method.
 */
/**
 * public void setBook(Book book)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setBook(Book book) { this.book = book; }

/**
 * public int getCopyNumber() { return copyNumber; }
 * Detailed description of the method.
 */
/**
 * public int getCopyNumber()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public int getCopyNumber() { return copyNumber; }
/**
 * public void setCopyNumber(int copyNumber) { this.copyNumber = copyNumber; }
 * Detailed description of the method.
 */
/**
 * public void setCopyNumber(int copyNumber)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setCopyNumber(int copyNumber) { this.copyNumber = copyNumber; }

/**
 * public String getStatus() { return status; }
 * Detailed description of the method.
 */
/**
 * public String getStatus()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public String getStatus() { return status; }
/**
 * public void setStatus(String status) { this.status = status; }
 * Detailed description of the method.
 */
/**
 * public void setStatus(String status)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setStatus(String status) { this.status = status; }
}