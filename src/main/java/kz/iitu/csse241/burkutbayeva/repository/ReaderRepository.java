package kz.iitu.csse241.burkutbayeva.repository;

import kz.iitu.csse241.burkutbayeva.database.Reader;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long> {
}
