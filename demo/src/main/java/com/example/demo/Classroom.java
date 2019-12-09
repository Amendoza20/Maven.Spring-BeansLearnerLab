package com.example.demo;

public class Classroom {
    private Students students;
    private Instructors instructors;

    public Classroom(Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        for (Student student: students){
            teacher.teach(student, numberOfHours);
        }
    }
}
