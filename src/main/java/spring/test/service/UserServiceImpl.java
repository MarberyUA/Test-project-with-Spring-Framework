package spring.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring.test.dao.UserDao;
import spring.test.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> listUsers() {
        return userDao.getAll();
    }
}
