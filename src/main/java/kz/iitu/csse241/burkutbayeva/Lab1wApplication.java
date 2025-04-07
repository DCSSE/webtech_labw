package kz.iitu.csse241.burkutbayeva;

import kz.iitu.csse241.burkutbayeva.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab1wApplication {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(Lab1wApplication.class, args);
        BookService bookService = context.getBean(BookService.class);
        bookService.listBooks().forEach(b -> System.out.println(b.getInfo()));
    }
}
