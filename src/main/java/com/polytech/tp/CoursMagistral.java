package com.polytech.tp;

public class CoursMagistral extends CoursDecorator {

    public CoursMagistral(ICours cours) {
        super(cours);
    }

    public String getDescription() {
        return super.getDescription() + " (Magistral)";
    }

    public double getDuree() {
        return super.getDuree();
    }
}
