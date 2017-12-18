package it.akademija.Users;

import java.util.List;

public interface UserDao {
    List<User> getUsers();
    void createUser(User user);
    void delteUser (String username);
}
