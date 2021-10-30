/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author zidol
 */
public class User {
    protected int id;
    protected String nom;
    protected String prenoms;
    protected String login;
    protected String password;
    protected String role;
    protected String sexe;
    protected int telephone;

    public User() {
    }

    public User(String nom, String prenoms, String role, String sexe, int telephone) {
        this.nom = nom;
        this.prenoms = prenoms;
        this.role = role;
        this.sexe = sexe;
        this.telephone = telephone;
    }

   

    public User(int id, String nom, String prenoms, String role, String sexe, int telephone) {
        this.id = id;
        this.nom = nom;
        this.prenoms = prenoms;
        this.role = role;
        this.sexe = sexe;
        this.telephone = telephone;
    }
    
    
    
    public User(String nom, String prenoms, String login, String password, String role, String sexe, int telephone) {
        this.nom = nom;
        this.prenoms = prenoms;
        this.login = login;
        this.password = password;
        this.role = role;
        this.sexe = sexe;
        this.telephone = telephone;
    }

    public User(int id, String nom, String prenoms, String login, String password, String role, String sexe, int telephone) {
        this.id = id;
        this.nom = nom;
        this.prenoms = prenoms;
        this.login = login;
        this.password = password;
        this.role = role;
        this.sexe = sexe;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getSexe() {
        return sexe;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
    
}
