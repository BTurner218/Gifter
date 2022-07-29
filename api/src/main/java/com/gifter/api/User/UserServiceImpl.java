package com.gifter.api.User;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public String getUser() {
        return "Hello from UserService!";
    }
}
