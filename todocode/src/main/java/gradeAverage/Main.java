package gradeAverage;

/*
Exercise No. 1 - Grade Average

A high school student wants to have an API that, when given the 3 grades of a subject,
returns the average grade. To pass the grades as a parameter, use the annotation @RequestParam.

 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(gradeAverage.Main.class, args);
    }

}
