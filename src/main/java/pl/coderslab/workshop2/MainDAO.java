package pl.coderslab.workshop2;

import pl.coderslab.workshop2.entity.User;
import pl.coderslab.workshop2.entity.UserDao;

public class MainDAO {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

//        Create user - test

//        User user = new User();
//        user.setUserName("Jan");
//        user.setEmail("jan.nowak@coderslab.pl");
//        user.setPassword("password");
//        userDao.create(user);

//        Read user - test

//        User read = userDao.read(1);
//        System.out.println(read);


//        Update user - test
//        User userToUpdate = userDao.read(1);
//        userToUpdate.setUserName("Jan Nowak");
//        userToUpdate.setEmail("jan.nowak@coderslab.pl");
//        userToUpdate.setPassword("password");
//        userDao.update(userToUpdate);

//        Find all users - test
//        User secondUser = new User();
//        secondUser.setUserName("marek");
//        secondUser.setEmail("marek@coderslab.pl");
//        secondUser.setPassword("pass");
//        userDao.create(secondUser);
//        User[] all = userDao.findAll();
//        for (User u : all) {
//            System.out.println(u);
//        }

//        Delete users - test

//        userDao.delete(1);
//        userDao.delete(2);
    }
}
