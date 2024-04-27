/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

/**
 *
 * @author Administrateur
 */
public class Homebean1 {
    
    private int id;
    private String nom_prof;
    private String cours;       
    private String salle;
    private String jour;
    private String metier;
    private String filiere;
    private String promo;

    public Homebean1(int id, String nom_prof, String cours, String salle, String jour, String metier, String filiere, String promo) {
        this.id = id;
        this.nom_prof = nom_prof;
        this.cours = cours;
        this.salle = salle;
        this.jour = jour;
        this.metier = metier;
        this.filiere = filiere;
        this.promo = promo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_prof() {
        return nom_prof;
    }

    public void setNom_prof(String nom_prof) {
        this.nom_prof = nom_prof;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

   
    }
