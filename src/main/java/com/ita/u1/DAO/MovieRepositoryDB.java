package com.ita.u1.DAO;

import com.ita.u1.domain.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepositoryDB implements MovieRepository {
    @Override
    public List<Movie> findAll() {
        List<Movie> movieList = new ArrayList<Movie>();
        movieList.add(new Movie("Harry Potter", "Fantasy"));
        movieList.add(new Movie("Home alone", "Comedy"));
        movieList.add(new Movie("The godfather", "Crime"));
        return movieList;
    }
}
