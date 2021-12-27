package com.ita.u1.config;

import com.ita.u1.DAO.MovieRepositoryDB;
import com.ita.u1.service.MovieReport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MovieRepositoryDB movieRepositoryDB() {
        return new MovieRepositoryDB();
    }

    @Bean
    public MovieReport movieReport() {
        return new MovieReport(movieRepositoryDB());
    }
}

