package kz.iitu.csse241.burkutbayeva;

import kz.iitu.csse241.burkutbayeva.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import kz.iitu.csse241.burkutbayeva.config.ApplicationConfig;
import kz.iitu.csse241.burkutbayeva.config.UserConfig;
import org.springframework.context.ApplicationContext;

@EnableAutoConfiguration
@ComponentScan(basePackages = "kz.iitu.csse241.burkutbayeva")
@Import({ApplicationConfig.class, UserConfig.class})
public class Lab1wApplication {
    public static void main(String[] args) {
        SpringApplication.run(Lab1wApplication.class, args);
    }

//    private static ApplicationContext context;
//
//    public static void main(String[] args) {
//        context = SpringApplication.run(Lab1wApplication.class, args);
//        BookService bookService = context.getBean(BookService.class);
//    }
}
