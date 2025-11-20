package com.polytech.tp;

public class Cours implements ICours {
    private String matiere;
    private String enseignant;
    private String salle;
    private String date;
    private String heureDebut;
    private boolean estOptionnel;
    private String niveau;
    private boolean necessiteProjecteur;


    private Cours(Builder builder) {
        this.matiere = builder.matiere;
        this.enseignant = builder.enseignant;
        this.salle = builder.salle;
        this.date = builder.date;
        this.heureDebut = builder.heureDebut;
        this.estOptionnel = builder.estOptionnel;
        this.niveau = builder.niveau;
        this.necessiteProjecteur = builder.necessiteProjecteur;
    }

    @Override
    public String getDescription() {
        return "Cours de " + matiere + " avec " + enseignant + " (" + salle + ")";
    }

    @Override
    public double getDuree() {
        return 1.5;
    }

    public String getMatiere() { return matiere; }
    public String getEnseignant() { return enseignant; }

    public static class Builder {
        private String matiere;
        private String enseignant;
        private String salle;
        private String date;
        private String heureDebut;
        private boolean estOptionnel;
        private String niveau;
        private boolean necessiteProjecteur;

        public Builder setMatiere(String matiere) {
            this.matiere = matiere;
            return this;
        }

        public Builder setEnseignant(String enseignant) {
            this.enseignant = enseignant;
            return this;
        }

        public Builder setSalle(String salle) {
            this.salle = salle;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setHeureDebut(String heureDebut) {
            this.heureDebut = heureDebut;
            return this;
        }

        public Builder setOptionnel(boolean estOptionnel) {
            this.estOptionnel = estOptionnel;
            return this;
        }

        public Builder setNiveau(String niveau) {
            this.niveau = niveau;
            return this;
        }

        public Builder setNecessiteProjecteur(boolean necessiteProjecteur) {
            this.necessiteProjecteur = necessiteProjecteur;
            return this;
        }

        public Cours build() {
            return new Cours(this);
        }
    }
}
