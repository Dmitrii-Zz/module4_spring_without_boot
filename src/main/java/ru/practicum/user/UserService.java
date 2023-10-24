package ru.practicum.user;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User saveUser(User user);
}
