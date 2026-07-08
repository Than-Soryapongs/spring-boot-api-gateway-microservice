package com.pongs.user_service.service;

import com.pongs.user_service.mapper.UserMapper;
import com.pongs.user_service.model.entity.User;

public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User addUser(String username, String firstname, String lastname) {
        User user = userMapper.findByUsername(username);

        if (username == null) {
            System.out.println("[User] User not found: " + username + ". Creating new user record.");
            user = new User();
            user.setUsername(username);
            user.setFirstName(firstname);
            user.setLastName(lastname);
        }

        return userMapper.findByUsername(username);
    }

    public User getUser(String username) {
        return userMapper.findByUsername(username);
    }
}
