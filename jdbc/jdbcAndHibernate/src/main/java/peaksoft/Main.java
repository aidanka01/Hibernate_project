package peaksoft;

import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //HIBERNATE users
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();

        // CREATE TABLE
        userDaoHibernate.createUsersTable();

        // SAVE USER
        userDaoHibernate.saveUser("Ali", "Hamzaev", (byte) 31);
        userDaoHibernate.saveUser("Aisha", "Zunaeva", (byte) 30);
        userDaoHibernate.saveUser("Bakr", "Ashimov", (byte) 43);
        userDaoHibernate.saveUser("Mondi", "Longman", (byte) 27);
        userDaoHibernate.saveUser("Asman", "Aliev", (byte) 19);


        // REMOVE users BY ID
        userDaoHibernate.removeUserById(2);

        // GET ALL users
        userDaoHibernate.getAllUsers();
        List<User> userHibernateList = userDaoHibernate.getAllUsers();
        System.out.println(userHibernateList);

        // CLEAN users TABLE
        userDaoHibernate.cleanUsersTable();

        //DROP TABLE users
        userDaoHibernate.dropUsersTable();


    }
}


