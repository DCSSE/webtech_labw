package kz.iitu.csse241.burkutbayeva.database;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Borrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long operationId;

    @ManyToOne
    @JoinColumn(name = "reader_id", nullable = false)
    private Reader reader;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    private LocalDate borrowDate;
    private LocalDate dueDate;
    private Integer units = 1;
    private String fineStatus;

    public String getInfo() {
        return "Operation #" + operationId + ": Reader " + readerId + " borrowed Book " + bookId;
    }
}
