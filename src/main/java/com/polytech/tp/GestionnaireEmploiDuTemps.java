package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observateurs = new ArrayList<>();

    public void attach(Observer o) {
        observateurs.add(o);
    }

    public void detach(Observer o) {
        observateurs.remove(o);
    }

    public void notifyObservers (String message) {
        for (Observer obs : observateurs) {
            obs.update(message);
        }
    }
    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        String message = "Nouveau cours ajouté : " + cours.getDescription();
        System.out.println(message);
        // TODO: C'est ici qu'il faudrait notifier les étudiants (Observer pattern)
        notifyObservers(message);
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        // TODO: Notifier les observateurs ici aussi
        notifyObservers(message);
    }
    public void setChangement(String message) {
        // Apply change and notify observers
        System.out.println("Changement: " + message);
        notifyObservers(message);
    }
    
}