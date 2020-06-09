package spring.test.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.test.UserResponseDto;
import spring.test.model.User;
import spring.test.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/inject")
    public void injectData() {
        userService.add(new User("John", "gaga@gmai.com", "123"));
        userService.add(new User("Max", "gaga@gmai.com", "123"));
        userService.add(new User("SashaGray", "gaga@gmai.com", "123"));
        userService.add(new User("SashaGray", "gaga@gmai.com", "123"));
    }

    @GetMapping("/{userId}")
    public UserResponseDto get(@PathVariable String userId) {
        User user = userService.get(Long.valueOf(userId));
        return new UserResponseDto(user.getUsername(), user.getEmail());
    }

    @GetMapping("/all")
    public List<UserResponseDto> getAll() {
        List<UserResponseDto> users = new ArrayList<>();
        for (User user : userService.listUsers()) {
            users.add(new UserResponseDto(user.getUsername(), user.getEmail()));
        }
        return users;
    }

}
