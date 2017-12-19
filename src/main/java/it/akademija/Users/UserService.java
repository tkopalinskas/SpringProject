//package it.akademija.Users;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Service
//public class UserService {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    @Qualifier("repoUserDao")
//    private UserDao userDao;
//
//    @Transactional()
//    public List<User> getUsers(){
//        return userDao.getUsers();
//    }
//    @Transactional
//    public void createUser(CreateUsers cmd){
//        User user = new User();
//        userRepository.save(user);
//
//    }
////    @Transactional
////    public void deleteUser(String username){
////        userDao.deleteUser(username);
////        }
//    }
//
