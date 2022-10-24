package spring.service;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import spring.dto.User;

import java.util.Optional;

@Service
public interface UserServiceInterface {
    Optional<User> getByUsername(@NonNull String username);
}
