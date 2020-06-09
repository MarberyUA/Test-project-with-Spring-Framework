package spring.test.dao;

import java.util.List;
import spring.test.model.User;

public interface UserDao {
    User add(User user);

    List<User> getAll();

    User get(Long id);
}
