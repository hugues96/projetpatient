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
public class Medecin extends User {
    private String specialite;
    private final String ROLE="ROLE_MEDECIN";

    public Medecin() {
        this.role = ROLE;
    }

    public Medecin(String specialite, String nom, String prenoms, String role, String sexe, int telephone) {
        super(nom, prenoms, role, sexe, telephone);
        this.specialite = specialite;
        this.role = ROLE;
        this.prenoms = prenoms;
        this.sexe = sexe;
        this.telephone = telephone;
        this.nom = nom;
    }

    public Medecin(String specialite, int id, String nom, String prenoms, String role, String sexe, int telephone) {
        super(id, nom, prenoms, role, sexe, telephone);
        this.specialite = specialite;
        this.role = ROLE;
        this.prenoms = prenoms;
        this.sexe = sexe;
        this.telephone = telephone;
        this.nom = nom;
    }

    

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    
    
    
}
