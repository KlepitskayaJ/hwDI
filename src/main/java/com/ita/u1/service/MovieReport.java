package com.ita.u1.service;

import com.ita.u1.DAO.MovieRepository;
import com.ita.u1.DAO.MovieRepositoryDB;
import com.ita.u1.domain.Movie;

import java.util.List;

public class MovieReport {
    MovieRepository movieRepository = new MovieRepositoryDB();

    public MovieReport(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void generate() {
        List<Movie> moviesFromDB = movieRepository.findAll();
        System.out.println("List of existing movies: ");
        for (Movie movieFromDB: moviesFromDB) {
            System.out.println(movieFromDB);
        }
    }
}
