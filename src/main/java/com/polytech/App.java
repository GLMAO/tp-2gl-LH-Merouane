package com.polytech;

import com.polytech.tp.Cours;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cours GL = new Cours.Builder()
        .setMatiere("Genie Logiciel")
        .setEnseignant("cdt Mazari")
        .setSalle("info6")
        .setDate("2025-11-20")
        .setHeureDebut("14:20")
        .setOptionnel(false)
        .setNiveau("M1")
        .setNecessiteProjecteur(true)
        .build();
    }
}
