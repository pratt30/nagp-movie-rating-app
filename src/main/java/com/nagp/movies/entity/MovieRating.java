package com.nagp.movies.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "movie_ratings")
@Getter
@Setter
public class MovieRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movie_name")
    private String movieName;

    private String genre;

    private Double rating;

    @Column(name = "review_count")
    private Integer reviewCount;
}