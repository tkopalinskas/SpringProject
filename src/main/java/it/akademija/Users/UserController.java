package it.akademija.Users;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "user")
@RequestMapping(value = "api/users")
public class UserController {
    private final UserDao userDao;
    //private final UserService userService;
    @Autowired
    UserRepository userRepository;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
        //this.userService = userService;
    }
    @RequestMapping(method = RequestMethod.POST,value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value="Create user",notes="Creates user with data")
    public void createUser(@RequestBody final CreateUsers cmd){
       // userService.createUser(cmd);
        System.out.println(cmd);



    }
    @RequestMapping(path="/delete/{username}", method = RequestMethod.GET)
    @ApiOperation(value="Delete user",notes="Deletes user data")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable final String username){
        System.out.println("deleting User: " + username);
        //userService.deleteUser(username);
    }
    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value="Get users",notes="Returns registered users")
    public List<User> getUsers(){
        return userDao.getUsers();
    }

}
