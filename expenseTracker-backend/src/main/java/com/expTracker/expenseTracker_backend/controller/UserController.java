package com.expTracker.expenseTracker_backend.controller;

import com.expTracker.expenseTracker_backend.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
public class UserController {

    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        // Dummy data for testing
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Rishita"));
        users.add(new User(2L, "Khushi"));
        users.add(new User(2L, "Sharanya"));
        return users;
    }
}