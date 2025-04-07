package kz.iitu.csse241.burkutbayeva;

import kz.iitu.csse241.burkutbayeva.database.Borrowing;
import kz.iitu.csse241.burkutbayeva.repository.BorrowingRepository;
import kz.iitu.csse241.burkutbayeva.service.BorrowingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

public class BorrowingServiceTest {

    @Mock
    private BorrowingRepository borrowingRepository;

    @InjectMocks
    private BorrowingService borrowingService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testListBorrowingsNotEmpty() {
        when(borrowingRepository.findAll()).thenReturn(Collections.singletonList(new Borrowing()));
        assertFalse(borrowingService.getAllBorrowings().isEmpty(), "Borrowing list should not be empty");
    }
}
