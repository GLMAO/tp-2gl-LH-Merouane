package com.polytech;

import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;
import com.polytech.tp.CoursEnAnglais;
import com.polytech.tp.CoursEnLigne;
import com.polytech.tp.CoursMagistral;
import com.polytech.tp.Etudiant;
import com.polytech.tp.GestionnaireEmploiDuTemps;
import com.polytech.tp.ICours;
import com.polytech.tp.Responsable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cours GL = new CoursBuilder()
        .setMatiere("Genie Logiciel")
        .setEnseignant("cdt Mazari")
        .setSalle("info6")
        .setDate("2025-11-20")
        .setHeureDebut("14:20")
        .setOptionnel(false)
        .setNiveau("M1")
        .setNecessiteProjecteur(true)
        .build();


        GestionnaireEmploiDuTemps gestionnaire = new GestionnaireEmploiDuTemps();

        Etudiant e1 = new Etudiant("Merouane");
        Etudiant e2 = new Etudiant("Walid");
        Responsable resp = new Responsable("Dr. Karim");

        gestionnaire.attach(e1);
        gestionnaire.attach(e2);
        gestionnaire.attach(resp);

        Cours algodist = new CoursBuilder()
            .setMatiere("algo distribuée")
            .setEnseignant("col senouci")
            .setSalle("amphi A")
            .build();

        gestionnaire.ajouterCours(algodist);
        gestionnaire.setChangement("Le cours de Algo Distribué a été annulé.");



        ICours cours = new CoursBuilder()
        .setMatiere("Programmation")
        .setEnseignant("Mr.Kechid")
        .setSalle("Amphi 2")
        .build();

        ICours coursEnLigne = new CoursEnLigne(cours);
        ICours coursenanglais = new CoursEnAnglais(cours);
        ICours coursmagistral = new CoursMagistral(cours);
        System.out.println(coursEnLigne.getDescription());
        System.out.println(coursenanglais.getDescription());
        System.out.println(coursmagistral.getDescription());
    }
}
