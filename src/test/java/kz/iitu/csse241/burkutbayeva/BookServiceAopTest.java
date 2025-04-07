package kz.iitu.csse241.burkutbayeva;

import kz.iitu.csse241.burkutbayeva.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceAopTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testAopLogging() {
        bookService.getAllBooks();
    }
}
