package kz.iitu.csse241.burkutbayeva.config;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import kz.iitu.csse241.burkutbayeva.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@PropertySource("${spring.profiles.active}")
@EnableAspectJAutoProxy
public class ApplicationConfig {

    @Autowired
    private BookService bookService;

    @PostConstruct
    public void init() {
        System.out.println("ApplicationConfig initialized");
        bookService.getAllBooks().forEach(b -> System.out.println(b.getInfo()));
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ApplicationConfig is being destroyed");
    }

    @Bean(initMethod = "onInit", destroyMethod = "onDestroy")
    public CustomLifecycleBean lifecycleBean() {
        return new CustomLifecycleBean();
    }

    public static class CustomLifecycleBean {
        public void onInit() {
            System.out.println("CustomLifecycleBean init()");
        }

        public void onDestroy() {
            System.out.println("CustomLifecycleBean destroy()");
        }
    }
}

