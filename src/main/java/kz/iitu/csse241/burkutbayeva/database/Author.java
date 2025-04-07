package kz.iitu.csse241.burkutbayeva.database;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authId;

    private String firstName;
    private String lastName;
    private Integer birthYear;
    private Integer deathYear;
    private String country;
}
