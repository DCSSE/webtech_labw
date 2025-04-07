package kz.iitu.csse241.burkutbayeva.repository;

import kz.iitu.csse241.burkutbayeva.database.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
