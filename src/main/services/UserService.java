package main.services;

import main.entities.User;
import main.repositories.UserRepository;

import java.util.List;

/**
 * This is the UserService class.
 * Detailed description of the class.
 */
/**
 * Represents the UserService class.
 * This class is responsible for managing userservice entities and logic.
 */
public class UserService {
    private final UserRepository userRepository;

/**
 * public UserService(UserRepository userRepository) {
 * Detailed description of the method.
 */
/**
 * public UserService(UserRepository userRepository)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

/**
 * public List<User> getAllUsers() {
 * Detailed description of the method.
 */
/**
 * public List<User> getAllUsers()
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

/**
 * public User getUserByEmail(String email) { return userRepository.getUserByEmail(email); }
 * Detailed description of the method.
 */
/**
 * public User getUserByEmail(String email)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public User getUserByEmail(String email) { return userRepository.getUserByEmail(email); }

/**
 * public User getUserById(long id) { return userRepository.getUserById(id); }
 * Detailed description of the method.
 */
/**
 * public User getUserById(long id)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public User getUserById(long id) { return userRepository.getUserById(id); }

/**
 * public void updateUser(User user) { userRepository.updateUser(user); }
 * Detailed description of the method.
 */
/**
 * public void updateUser(User user)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void updateUser(User user) { userRepository.updateUser(user); }

/**
 * public void addUser(User user) {
 * Detailed description of the method.
 */
/**
 * public void addUser(User user)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void addUser(User user) {
        userRepository.saveUser(user);
    }

/**
 * public void deleteUser(Long userId) {
 * Detailed description of the method.
 */
/**
 * public void deleteUser(Long userId)
 * This method performs the operation related to the signature.
 * Add specific details about the parameters and functionality here.
 */
    public void deleteUser(Long userId) {
        userRepository.deleteUser(userId);
    }
}