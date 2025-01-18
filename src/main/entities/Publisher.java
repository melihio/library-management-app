package main.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Publishers")
/**
 * This is the Publisher class.
 * Detailed description of the class.
 */
/**
 * Represents the Publisher class.
 * This class is responsible for managing publisher entities and logic.
 */
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private String phoneNumber;

    @OneToMany(mappedBy = "publisher", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Book> books = new ArrayList<>();

/**
 * public Publisher() {}
 * Detailed description of the method.
 */
/**
 * public Publisher()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Publisher() {}

/**
 * public Publisher(String name, String address, String phoneNumber) {
 * Detailed description of the method.
 */
/**
 * public Publisher(String name, String address, String phoneNumber)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Publisher(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
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
        return this.name;
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
 * public String getName() { return name; }
 * Detailed description of the method.
 */
/**
 * public String getName()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public String getName() { return name; }
/**
 * public void setName(String name) { this.name = name; }
 * Detailed description of the method.
 */
/**
 * public void setName(String name)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setName(String name) { this.name = name; }

/**
 * public String getAddress() { return address; }
 * Detailed description of the method.
 */
/**
 * public String getAddress()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public String getAddress() { return address; }
/**
 * public void setAddress(String address) { this.address = address; }
 * Detailed description of the method.
 */
/**
 * public void setAddress(String address)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setAddress(String address) { this.address = address; }

/**
 * public String getPhoneNumber() { return phoneNumber; }
 * Detailed description of the method.
 */
/**
 * public String getPhoneNumber()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public String getPhoneNumber() { return phoneNumber; }
/**
 * public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
 * Detailed description of the method.
 */
/**
 * public void setPhoneNumber(String phoneNumber)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

/**
 * public List<Book> getBooks() { return books; }
 * Detailed description of the method.
 */
/**
 * public List<Book> getBooks()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public List<Book> getBooks() { return books; }
/**
 * public void setBooks(List<Book> books) { this.books = books; }
 * Detailed description of the method.
 */
/**
 * public void setBooks(List<Book> books)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setBooks(List<Book> books) { this.books = books; }
}