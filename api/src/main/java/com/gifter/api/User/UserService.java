package com.gifter.api.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(Long id);

    void createUser(RegisterDTO registerDTO);

}
