package kz.iitu.csse241.burkutbayeva;

import kz.iitu.csse241.burkutbayeva.database.Borrowing;
import kz.iitu.csse241.burkutbayeva.repository.BorrowingRepository;
import kz.iitu.csse241.burkutbayeva.service.BorrowingService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class BorrowingServiceTest {
    private final BorrowingService borrowingService = new BorrowingService();

    @Test
    public void testListBorrowingsNotEmpty() {
        List<Borrowing> borrowings = new BorrowingRepository().getAllBorrowings();
        assertFalse(borrowings.isEmpty(), "Borrowing list should not be empty");
    }
}
