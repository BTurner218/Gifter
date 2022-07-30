package com.gifter.api.User;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@AllArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/register")
    public void registerUser(@RequestBody RegisterDTO registerDTO) {
        userService.createUser(registerDTO);
    }

}
