package ru.practicum.user;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final HashMap<Long, User> users = new HashMap<>();

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public User save(User user) {
        users.put(user.getId(), user);
        return user;
    }
}
