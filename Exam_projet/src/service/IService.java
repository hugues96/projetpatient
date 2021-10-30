/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.RendezVous;
import entities.Ordonnance;
import entities.RendezVous;
import java.util.List;

/**
 *
 * @author zidol
 */
public class IService {
   
    //Compte
    public int addCompte(Compte compte);
   
    //rendezvous
    
    public boolean updateRendezVous(int id);
    public List<RendezVous> searchAllRendezVous();
    public int addRendezVous(RendezVous rendezVous);
    public RendezVous searchOneRendezVous(int id);
    public boolean deleteOneRendezVous (int id)
    
    //ordonnance
   
    public int addOrdonnances(Ordonnances ordonnances);
    public List<Ordonnances> searchAllordonnances();
    public Ordonnances searchOneOrdonnances(int id);
    public int addOrdonnance(Ordonnance ordonnance);
    
    
    //consultation
   
    public List<Consultation> searchAllConsultation();
    public Ordonnances searchOneConsultation(int id);
    public int addConsultation(Consultation consultation);
    

    //prestation
            
    public List<Prestation> searchAllPrestation();
    public Prestation searchOnePrestation(int id);
    
    public IService() {
    }
    
    
    //patient
    
    //medecin
    
    
    //secretaire
    
    
    //
   
    
}
