package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorConfig {
    Instructors tcUsaInstructors = new Instructors(
            (new Instructor(1L, "Bill Jobs")),
            (new Instructor(2L, "Steve Gates")));
    Instructors tcUkInstructors = new Instructors(
            (new Instructor(1L, "Albus Dumbledore")),
            (new Instructor(2L, "Severus Snape")));
    @Bean(name = "USA")
    Instructors tcUsaInstructors(){
        return tcUsaInstructors;
    }
    @Bean(name = "UK")
    Instructors tcUKInstructors(){
        return tcUkInstructors;
    }
    @Bean
    @Primary
    Instructors instructors(){
        Instructors instructors = new Instructors();
        instructors.addAll(tcUsaInstructors);
        instructors.addAll(tcUkInstructors);
        return instructors;
    }
}
