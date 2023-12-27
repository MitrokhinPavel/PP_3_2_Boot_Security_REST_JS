package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;

public interface UserService {
    void createUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    List<User> getAllUsers();

    User getUserById(Long id);

    User findByEmail(String email);
}
