package spring.test.dao;

import spring.test.model.User;

import java.util.List;

public interface UserDao {
    User add(User user);

    List<User> getAll();
}
