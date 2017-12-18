package it.akademija.Users;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public class InMemoryUserDAO implements UserDao {
    private final List<User> users = new CopyOnWriteArrayList<>();
    @Override
    public List<User> getUsers() {
        return Collections.unmodifiableList(users);
    }

    @Override
    public void createUser(User user) {
    users.add(user);
    }

    @Override
    public void delteUser(String username) {
        for (User user : users){
            if (username.equals(user.getUsername()));
            break;
        }
    }
}
