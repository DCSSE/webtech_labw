package kz.iitu.csse241.burkutbayeva.service;

import kz.iitu.csse241.burkutbayeva.database.Reader;
import kz.iitu.csse241.burkutbayeva.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderService {
    @Autowired
    private ReaderRepository readerRepository;

    public List<Reader> getAllReaders() {
        return readerRepository.findAll();
    }

    public Reader saveReader(Reader reader) {
        return readerRepository.save(reader);
    }
}
