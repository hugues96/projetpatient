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
public class Secretaire extends User {
    private final String ROLE="ROLE_SECRETAIRE";

    public Secretaire() {
        this.role = ROLE; 
    }

    public Secretaire(String nom, String prenoms, String role, String sexe, int telephone) {
        super(nom, prenoms, role, sexe, telephone);
        this.role = ROLE;
        this.prenoms = prenoms;
        this.sexe = sexe;
        this.telephone = telephone;
        this.nom = nom;
    }

    public Secretaire(int id, String nom, String prenoms, String role, String sexe, int telephone) {
        super(id, nom, prenoms, role, sexe, telephone);
        this.role = ROLE;
        this.prenoms = prenoms;
        this.sexe = sexe;
        this.telephone = telephone;
        this.nom = nom;
    }

    

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getPrenoms() {
        return prenoms;
    }

    
    @Override
    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getSexe() {
        return sexe;
    }

    @Override
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Override
    public int getTelephone() {
        return telephone;
    }

    @Override
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
    
    
    
    
    
    
    
    
}
