package com.polytech.tp;

public class CoursEnAnglais extends CoursDecorator {

    public CoursEnAnglais(ICours cours) {
        super(cours);
    }

    public String getDescription() {
        return super.getDescription() + " (en Anglais)";
    }

    public double getDuree() {
        return super.getDuree();
    }
}
