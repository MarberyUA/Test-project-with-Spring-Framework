package spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.test.config.AppConfig;
import spring.test.model.User;
import spring.test.service.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(new User("John", "123"));
        userService.add(new User("Max", "123"));
        userService.add(new User("SashaGray", "123"));

        List<User> userList = userService.listUsers();
        System.out.println(userList);
    }
}