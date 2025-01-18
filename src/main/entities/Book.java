package main.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Books")
/**
 * This is the Book class.
 * Detailed description of the class.
 */
/**
 * Represents the Book class.
 * This class is responsible for managing book entities and logic.
 */
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    private int publicationYear;

    @Column(unique = true, nullable = false)
    private String isbn;

    @OneToMany(mappedBy = "book", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Copy> copies = new ArrayList<>();

/**
 * public Book() {}
 * Detailed description of the method.
 */
/**
 * public Book()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Book() {}

/**
 * public Book(String title, String author, Publisher publisher, int publicationYear, String isbn) {
 * Detailed description of the method.
 */
/**
 * public Book(String title, String author, Publisher publisher, int publicationYear, String isbn)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Book(String title, String author, Publisher publisher, int publicationYear, String isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
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
        return this.title;
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
 * public String getTitle() { return title; }
 * Detailed description of the method.
 */
/**
 * public String getTitle()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public String getTitle() { return title; }
/**
 * public void setTitle(String title) { this.title = title; }
 * Detailed description of the method.
 */
/**
 * public void setTitle(String title)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setTitle(String title) { this.title = title; }

/**
 * public String getAuthor() { return author; }
 * Detailed description of the method.
 */
/**
 * public String getAuthor()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public String getAuthor() { return author; }
/**
 * public void setAuthor(String author) { this.author = author; }
 * Detailed description of the method.
 */
/**
 * public void setAuthor(String author)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setAuthor(String author) { this.author = author; }

/**
 * public Publisher getPublisher() { return publisher; }
 * Detailed description of the method.
 */
/**
 * public Publisher getPublisher()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Publisher getPublisher() { return publisher; }
/**
 * public void setPublisher(Publisher publisher) { this.publisher = publisher; }
 * Detailed description of the method.
 */
/**
 * public void setPublisher(Publisher publisher)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setPublisher(Publisher publisher) { this.publisher = publisher; }

/**
 * public int getPublicationYear() { return publicationYear; }
 * Detailed description of the method.
 */
/**
 * public int getPublicationYear()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public int getPublicationYear() { return publicationYear; }
/**
 * public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }
 * Detailed description of the method.
 */
/**
 * public void setPublicationYear(int publicationYear)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }

/**
 * public String getIsbn() { return isbn; }
 * Detailed description of the method.
 */
/**
 * public String getIsbn()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public String getIsbn() { return isbn; }
/**
 * public void setIsbn(String isbn) { this.isbn = isbn; }
 * Detailed description of the method.
 */
/**
 * public void setIsbn(String isbn)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setIsbn(String isbn) { this.isbn = isbn; }

/**
 * public List<Copy> getCopies() { return copies; }
 * Detailed description of the method.
 */
/**
 * public List<Copy> getCopies()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public List<Copy> getCopies() { return copies; }
/**
 * public void setCopies(List<Copy> copies) { this.copies = copies; }
 * Detailed description of the method.
 */
/**
 * public void setCopies(List<Copy> copies)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setCopies(List<Copy> copies) { this.copies = copies; }
}