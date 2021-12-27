package com.ita.u1.DAO;

import com.ita.u1.domain.Movie;

import java.util.List;

public interface MovieRepository {
    List<Movie> findAll();
}
