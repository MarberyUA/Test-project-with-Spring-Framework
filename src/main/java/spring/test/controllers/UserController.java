package spring.test.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.test.config.AppConfig;
import spring.test.model.User;
import spring.test.service.UserService;
import spring.test.util.ApplicationContextUtil;

@RequestMapping("/user")
@RestController
public class UserController {
    private final UserService userService = ApplicationContextUtil.getInstance(AppConfig.class)
            .getBean(UserService.class);

    @GetMapping("/inject")
    public void injectData() {

        userService.add(new User("John", "123"));
        userService.add(new User("Max", "123"));
        userService.add(new User("SashaGray", "123"));
    }

    @GetMapping("/{userId}")
    public User get(@PathVariable String userId) {
        Long id = Long.valueOf(userId);
        return userService.get(id);
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.listUsers();
    }

}
