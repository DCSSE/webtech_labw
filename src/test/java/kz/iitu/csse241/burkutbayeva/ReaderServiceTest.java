package kz.iitu.csse241.burkutbayeva;

import kz.iitu.csse241.burkutbayeva.database.Reader;
import kz.iitu.csse241.burkutbayeva.repository.ReaderRepository;
import kz.iitu.csse241.burkutbayeva.service.ReaderService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

public class ReaderServiceTest {
    @Mock
    private ReaderRepository readerRepository;

    @InjectMocks
    private ReaderService readerService;

    public ReaderServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllReaders() {
        when(readerRepository.findAll()).thenReturn(Collections.singletonList(new Reader()));
        assertEquals(1, readerService.getAllReaders().size());
    }
}
