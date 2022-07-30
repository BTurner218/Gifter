package com.gifter.api.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public void createUser(RegisterDTO registerDTO) {
        User newUser = new User();
        newUser.setEmail((registerDTO.getEmail()));
        newUser.setUsername((registerDTO.getUsername()));
        newUser.setPassword((registerDTO.getPassword()));
        userRepository.save(newUser);
    }

}
