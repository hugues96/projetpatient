/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author zidol
 */
public class RendezVous {
     protected int id;
     protected String heure_deb;
     protected Date date;
     protected String detail;
     protected String heure_fin;

    public RendezVous() {
    }

    public RendezVous(String heure_deb, Date date, String detail, String heure_fin) {
        this.heure_deb = heure_deb;
        this.date = date;
        this.detail = detail;
        this.heure_fin = heure_fin;
    }

    public RendezVous(int id, String heure_deb, Date date, String detail, String heure_fin) {
        this.id = id;
        this.heure_deb = heure_deb;
        this.date = date;
        this.detail = detail;
        this.heure_fin = heure_fin;
    }

    public String getHeure_deb() {
        return heure_deb;
    }

    public void setHeure_deb(String heure_deb) {
        this.heure_deb = heure_deb;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getHeure_fin() {
        return heure_fin;
    }

    public void setHeure_fin(String heure_fin) {
        this.heure_fin = heure_fin;
    }
     
     

    
}
