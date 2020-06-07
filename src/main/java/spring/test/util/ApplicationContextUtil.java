package spring.test.util;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.test.config.AppConfig;

public class ApplicationContextUtil {
    private static AnnotationConfigApplicationContext context;

    private ApplicationContextUtil() {
    }

    public static AnnotationConfigApplicationContext getInstance() {
        if (context == null) {
            context = new AnnotationConfigApplicationContext(AppConfig.class);
        }
        return context;
    }
}
