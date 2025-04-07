package kz.iitu.csse241.burkutbayeva.repository;

import kz.iitu.csse241.burkutbayeva.database.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}

