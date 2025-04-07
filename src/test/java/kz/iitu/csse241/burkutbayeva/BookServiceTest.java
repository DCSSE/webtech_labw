package kz.iitu.csse241.burkutbayeva;

import kz.iitu.csse241.burkutbayeva.database.Book;
import kz.iitu.csse241.burkutbayeva.repository.BookRepository;
import kz.iitu.csse241.burkutbayeva.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    public BookServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllBooks() {
        when(bookRepository.findAll()).thenReturn(Arrays.asList(new Book()));
        assertFalse(bookService.getAllBooks().isEmpty());
    }
}
