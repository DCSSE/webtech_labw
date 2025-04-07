package kz.iitu.csse241.burkutbayeva.repository;

import kz.iitu.csse241.burkutbayeva.database.Borrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {
}
