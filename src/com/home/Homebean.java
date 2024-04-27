/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

/**
 *
 * @author Administrateur
 */
public class Homebean {
    
    private int id;
    private String prenom;
    private String nom;       
    private String sexe;
    private String age;
    private String filiere;
    private String metier;
    private String note;
    private String remediation;

    public Homebean(int id,String prenom, String nom, String sexe, String age, String filiere, String metier, String note, String remediation) {
        this.id = id; 
        this.prenom = prenom;
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
        this.filiere = filiere;
        this.metier = metier;
        this.note = note;
        this.remediation = remediation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getRemediation() {
        return remediation;
    }

    public void setRemediation(String remediation) {
        this.remediation = remediation;
    }
    
    
    }
