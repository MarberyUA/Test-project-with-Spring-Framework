package spring.test.util;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextUtil {
    private static AnnotationConfigApplicationContext context;
    private Class cls;

    private ApplicationContextUtil(Class cls) {
        this.cls = cls;
    }

    public static AnnotationConfigApplicationContext getInstance(Class value) {
        if (context == null) {
            context = new AnnotationConfigApplicationContext(value);
        }
        return context;
    }
}
