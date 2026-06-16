package com.nagp.movies.controller;

import com.nagp.movies.entity.MovieRating;
import com.nagp.movies.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/api/movies")
    public List<MovieRating> getMovies() {
        return movieService.getAllMovies();
    }
}