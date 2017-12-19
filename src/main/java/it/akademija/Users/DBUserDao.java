//package it.akademija.Users;
//
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//@Repository
//public class DBUserDao implements UserDao {
//    @PersistenceContext private EntityManager entityManager;
//    public List<User> getUsers() {
//        return entityManager.createQuery("SELECT u from User u", User.class).getResultList();
//    }
//
//    @Override
//    public void createUser(User user) {
//    entityManager.persist(user);
//    }
//
//    @Override
//    public void deleteUser(String username) {
//    User user = entityManager
//            .createQuery("SELECT u from User u where username = :un", User.class)
//            .setParameter("un", username).getSingleResult();
//    if (entityManager.contains(user)){
//        entityManager.remove(user);
//    } else {
//        entityManager.remove(entityManager.merge(user));
//    }
//    }
//}
