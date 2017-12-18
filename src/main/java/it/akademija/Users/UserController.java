package it.akademija.Users;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/users")
public class UserController {
    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }
    @RequestMapping(method = RequestMethod.GET,value = "/create")
    public void createUser(){
        User us1 = new User("kepalas","Tomas", "Kop","kop@gmail.com");
            userDao.createUser(us1);

    }
    @RequestMapping(path="/delete/{username}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable final String username){
        System.out.println("deleting User: " + username);
        userDao.deleteUser(username);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers(){
        return userDao.getUsers();
    }

}
