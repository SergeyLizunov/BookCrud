package org.coursera.crud.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "books")
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;

    @Column(name = "Book_title")
    @Getter
    @Setter
    private String title;

    @Column(name = "Author")
    @Getter
    @Setter
    private String author;

    @Column(name = "Genre")
    @Getter
    @Setter
    private String genre;
}
