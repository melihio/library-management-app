package main.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Librarians")
/**
 * This is the Librarian class.
 * Detailed description of the class.
 */
/**
 * Represents the Librarian class.
 * This class is responsible for managing librarian entities and logic.
 */
public class Librarian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private Date employmentDate;

    private String position;

/**
 * public Librarian() {}
 * Detailed description of the method.
 */
/**
 * public Librarian()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Librarian() {}

/**
 * public Librarian(User user, Date employmentDate, String position) {
 * Detailed description of the method.
 */
/**
 * public Librarian(User user, Date employmentDate, String position)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Librarian(User user, Date employmentDate, String position) {
        this.user = user;
        this.employmentDate = employmentDate;
        this.position = position;
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
 * public User getUser() { return user; }
 * Detailed description of the method.
 */
/**
 * public User getUser()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public User getUser() { return user; }
/**
 * public void setUser(User user) { this.user = user; }
 * Detailed description of the method.
 */
/**
 * public void setUser(User user)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setUser(User user) { this.user = user; }

/**
 * public Date getEmploymentDate() { return employmentDate; }
 * Detailed description of the method.
 */
/**
 * public Date getEmploymentDate()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public Date getEmploymentDate() { return employmentDate; }
/**
 * public void setEmploymentDate(Date employmentDate) { this.employmentDate = employmentDate; }
 * Detailed description of the method.
 */
/**
 * public void setEmploymentDate(Date employmentDate)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setEmploymentDate(Date employmentDate) { this.employmentDate = employmentDate; }

/**
 * public String getPosition() { return position; }
 * Detailed description of the method.
 */
/**
 * public String getPosition()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public String getPosition() { return position; }
/**
 * public void setPosition(String position) { this.position = position; }
 * Detailed description of the method.
 */
/**
 * public void setPosition(String position)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void setPosition(String position) { this.position = position; }
}