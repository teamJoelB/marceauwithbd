/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.marceau.model;

/**
 *
 * @author joelg
 */
public class Personne {
    
    private int id;
    private String nom;
    private int age;
    private String login;
    private String mdp;

    public Personne() {
    }

    public Personne(int id, String nom, int age, String login, String mdp) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.login = login;
        this.mdp = mdp;
    }

    public Personne(String nom, int age, String login, String mdp) {
        this.nom = nom;
        this.age = age;
        this.login = login;
        this.mdp = mdp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
    
    
}
