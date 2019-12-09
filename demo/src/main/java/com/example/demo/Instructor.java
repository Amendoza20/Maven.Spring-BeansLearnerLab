package com.example.demo;

import java.util.Collection;
public class Instructor extends Person implements Teacher{

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Collection<? extends Learner> learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours/learners.size();
        for(Learner learner : learners){
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
