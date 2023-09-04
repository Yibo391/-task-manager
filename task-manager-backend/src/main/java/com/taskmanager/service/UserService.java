package com.taskmanager.service;

import com.taskmanager.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User register(User user) {
        // Here, add logic to save the user to the database
        return user;
    }

    public User login(User user) {
        // Here, add logic to authenticate the user
        return user;
    }
}
