package com.ita.u1;

import com.ita.u1.service.MovieReport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MovieReport movieReport = context.getBean("movieReport", MovieReport.class);
        movieReport.generate();
        context.close();
    }
}
