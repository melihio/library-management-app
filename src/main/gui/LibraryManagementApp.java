package main.gui;

import main.managers.GeneralManager;

import javax.swing.*;
import java.awt.*;

/**
 * This is the LibraryManagementApp extends JFrame class.
 * Detailed description of the class.
 */
/**
 * Represents the LibraryManagementApp extends JFrame class.
 * This class is responsible for managing librarymanagementapp extends jframe entities and logic.
 */
public class LibraryManagementApp extends JFrame {

/**
 * public LibraryManagementApp() {
 * Detailed description of the method.
 */
/**
 * public LibraryManagementApp()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public LibraryManagementApp() {
        setTitle("Library Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        JTabbedPane tabbedPane = new JTabbedPane();

        GeneralManager generalManager = GeneralManager.getInstance();

        tabbedPane.addTab("Manage Users", new UserManagementPanel(generalManager));

        tabbedPane.addTab("Manage Books", new BookManagementPanel(generalManager));

        tabbedPane.addTab("Manage Borrowings", new BorrowingManagementPanel(generalManager));

        tabbedPane.addTab("Manage Publishers", new PublisherManagementPanel(generalManager));

        tabbedPane.addTab("Manage Copies", new CopyManagementPanel(generalManager));

        add(tabbedPane, BorderLayout.CENTER);
        setVisible(true);
    }
}
