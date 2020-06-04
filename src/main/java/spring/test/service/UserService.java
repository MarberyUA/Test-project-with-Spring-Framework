package spring.test.service;

import java.util.List;
import spring.test.model.User;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    User get(Long id);
}
