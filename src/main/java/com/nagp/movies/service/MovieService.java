package com.nagp.movies.service;

import com.nagp.movies.entity.MovieRating;
import com.nagp.movies.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<MovieRating> getAllMovies() {
        return repository.findAll();
    }
}