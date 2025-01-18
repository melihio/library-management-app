package main.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// Users Entity
@Entity
@Table(name = "Users")
/**
 * This is the User class.
 * Detailed description of the class.
 */
/**
 * Represents the User class.
 * This class is responsible for managing user entities and logic.
 */
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String phoneNumber;

    private String address;

    // Relationships
    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Borrowing> borrowings = new ArrayList<>();

/**
 * public User() {}
 * Detailed description of the method.
 */
/**
 * public User()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public User() {}

/**
 * public User(String name, String email, String phoneNumber, String address) {
 * Detailed description of the method.
 */
/**
 * public User(String name, String email, String phoneNumber, String address)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public User(String name, String email, String phoneNumber, String address) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
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
 * public String getEmail() { return email; }
 * Detailed description of the method.
 */
/**
 * public String getEmail()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public String getEmail() { return email; }
/**
 * public void setEmail(String email) { this.email = email; }
 * Detailed description of the method.
 */
/**
 * public void setEmail(String email)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setEmail(String email) { this.email = email; }

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
 * public List<Borrowing> getBorrowings() { return borrowings; }
 * Detailed description of the method.
 */
/**
 * public List<Borrowing> getBorrowings()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public List<Borrowing> getBorrowings() { return borrowings; }
/**
 * public void setBorrowings(List<Borrowing> borrowings) { this.borrowings = borrowings; }
 * Detailed description of the method.
 */
/**
 * public void setBorrowings(List<Borrowing> borrowings)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setBorrowings(List<Borrowing> borrowings) { this.borrowings = borrowings; }
}