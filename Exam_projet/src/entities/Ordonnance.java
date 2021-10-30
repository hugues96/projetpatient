/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author zidol
 */
public class Ordonnance {
    private int id;
    private String detail;
    private Date date;
    
    private Consultation Consultation;
    List<Medicament> medicament;

    public Ordonnance() {
    }

    public Ordonnance(int id, String detail, Date date, Consultation Consultation, List<Medicament> medicament) {
        this.id = id;
        this.detail = detail;
        this.date = date;
        this.Consultation = Consultation;
        this.medicament = medicament;
    }

    public Ordonnance(String detail, Date date, Consultation Consultation, List<Medicament> medicament) {
        this.detail = detail;
        this.date = date;
        this.Consultation = Consultation;
        this.medicament = medicament;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Consultation getConsultation() {
        return Consultation;
    }

    public void setConsultation(Consultation Consultation) {
        this.Consultation = Consultation;
    }

    public List<Medicament> getMedicament() {
        return medicament;
    }

    public void setMedicament(List<Medicament> medicament) {
        this.medicament = medicament;
    }

    
}
