package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {
    @Bean
    @DependsOn({"instructors", "currentStudents"})
    Classroom currentCohort(Students currentStudents, Instructors instructors){
        return new Classroom(currentStudents, instructors);
    }
    @Bean
    @DependsOn({"instructors", "previousStudents"})
    Classroom previousCohort(Students previousStudents, Instructors instructors){
        return new Classroom(previousStudents, instructors);
    }
}
