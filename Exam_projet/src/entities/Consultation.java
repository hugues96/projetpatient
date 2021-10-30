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
public class Consultation extends RendezVous {
    
    List<Ordonnance> Ordonnance ;
    List<Constante> constante ;

    public Consultation() {
    }

    public Consultation(String heure_deb, Date date, String detail, String heure_fin) {
        super(heure_deb, date, detail, heure_fin);
        this.heure_deb = heure_deb;
        this.date = date;
        this.detail = detail;
        this.heure_fin = heure_fin;
    }

    @Override
    public String getHeure_deb() {
        return heure_deb;
    }

    @Override
    public void setHeure_deb(String heure_deb) {
        this.heure_deb = heure_deb;
    }

    @Override
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String getDetail() {
        return detail;
    }

    @Override
    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String getHeure_fin() {
        return heure_fin;
    }

    @Override
    public void setHeure_fin(String heure_fin) {
        this.heure_fin = heure_fin;
    }
    
    
}
