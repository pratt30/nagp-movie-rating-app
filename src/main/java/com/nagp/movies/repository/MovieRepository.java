package com.nagp.movies.repository;

import com.nagp.movies.entity.MovieRating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository
        extends JpaRepository<MovieRating, Long> {
}