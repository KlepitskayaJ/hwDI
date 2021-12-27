package com.ita.u1;

import com.ita.u1.config.SpringConfig;
import com.ita.u1.service.MovieReport;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        MovieReport movieReport = context.getBean("movieReport", MovieReport.class);
        movieReport.generate();
        context.close();
    }
}
