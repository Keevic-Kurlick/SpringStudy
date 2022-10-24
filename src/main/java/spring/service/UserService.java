package spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import spring.dto.Role;
import spring.dto.User;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceInterface {
    private final List<User> users;

    public UserService() {
        this.users = List.of(
                new User("admin", "1234", Collections.singleton(Role.ADMIN)),
                new User("user", "123", Collections.singleton(Role.USER))
        );
    }

    @Override
    public Optional<User> getByUsername(@NonNull String username) {
        return users.stream()
                .filter(user -> username.equals(user.getUsername()))
                .findFirst();
    }
}
