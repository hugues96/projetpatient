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
public class Constante {
    private int id;
    private String temperature;
    private String tention;
    
    private Consultation consultation;

    public Constante() {
    }

    public Constante(int id, String temperature, String tention, Consultation consultation) {
        this.id = id;
        this.temperature = temperature;
        this.tention = tention;
        this.consultation = consultation;
    }

    public Constante(String temperature, String tention, Consultation consultation) {
        this.temperature = temperature;
        this.tention = tention;
        this.consultation = consultation;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTention() {
        return tention;
    }

    public void setTention(String tention) {
        this.tention = tention;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
    
    
}
