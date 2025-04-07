package kz.iitu.csse241.burkutbayeva.service;

import kz.iitu.csse241.burkutbayeva.database.Genre;
import kz.iitu.csse241.burkutbayeva.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {
    @Autowired
    private GenreRepository genreRepository;

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }
}

