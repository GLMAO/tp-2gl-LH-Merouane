package com.polytech.tp;

public class CoursBuilder {
    // TODO: Implémenter le pattern Builder
    String matiere;
    String enseignant;
    String salle;
    String date;
    String heureDebut;
    boolean estOptionnel;
    String niveau;
    boolean necessiteProjecteur;

    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }

    public CoursBuilder setSalle(String salle) {
        this.salle = salle;
        return this;
    }

    public CoursBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public CoursBuilder setHeureDebut(String heure) {
        this.heureDebut = heure;
        return this;
    }

    public CoursBuilder setOptionnel(boolean optionnel) {
        this.estOptionnel = optionnel;
        return this;
    }

    public CoursBuilder setNiveau(String niveau) {
        this.niveau = niveau;
        return this;
    }

    public CoursBuilder setNecessiteProjecteur(boolean besoin) {
        this.necessiteProjecteur = besoin;
        return this;
    }
    
    public Cours build() {
        return new Cours(this);
    }
}