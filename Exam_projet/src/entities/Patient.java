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
public class Patient extends User {
    private String matricule;
    private String maladie;
    private final String ROLE="ROLE_PATIENT";

    public Patient() {
        this.role = ROLE;
    }

    public Patient(String matricule, String maladie, String nom, String prenoms, String role, String sexe, int telephone) {
        super(nom, prenoms, role, sexe, telephone);
        this.matricule = matricule;
        this.maladie = maladie;
        this.role = ROLE;
        this.prenoms = prenoms;
        this.sexe = sexe;
        this.telephone = telephone;
        this.nom = nom;
    }

    public Patient(String matricule, String maladie, int id, String nom, String prenoms, String role, String sexe, int telephone) {
        super(id, nom, prenoms, role, sexe, telephone);
        this.matricule = matricule;
        this.maladie = maladie;
        this.role = ROLE;
        this.prenoms = prenoms;
        this.sexe = sexe;
        this.telephone = telephone;
        this.nom = nom;
    }


    
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMaladie() {
        return maladie;
    }

    public void setMaladie(String maladie) {
        this.maladie = maladie;
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

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
    
    
}
