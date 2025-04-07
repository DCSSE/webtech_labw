package kz.iitu.csse241.burkutbayeva.database;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String title;

    @ManyToOne
    @JoinColumn(name = "auth_id", nullable = false)
    private Author author;

    private Integer yearPublished;
    private String isbn;
    private String publicationPrint;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    private Double price;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String status;
    private Integer units = 1;

    public String getInfo() {
        return bookId + ": " + title + " (" + status + ")";
    }
}
