import dao.UserDao;
import dao.UserDaoHibernateImpl;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDaoHibernateImpl();

        userDao.saveUser("Name1", "LastName1", (byte) 20);
        userDao.saveUser("Name2", "LastName2", (byte) 21);
        userDao.saveUser("Name3", "LastName3", (byte) 22);
        userDao.saveUser("Name4", "LastName4", (byte) 23);

        userDao.removeUserById(2);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
