package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    Students currentStudents = new Students(
            (new Student( 1L, "Maira Botelho")),
            (new Student( 2L, "Julia Evans")),
            (new Student(3L, "Angel Mendoza"))
            );
    Students previousStudents = new Students(
            (new Student(1L, "Sian Carter")),
            (new Student(2L, "Desa Burton")),
            (new Student(3L, "Nancy Byrne")));
    @Bean(name = "currentStudents")
    public Students currentStudents(){
        return currentStudents;
    }
    @Bean(name = "previousStudents")
    public Students previousStudents(){
        return previousStudents;
    }
}
