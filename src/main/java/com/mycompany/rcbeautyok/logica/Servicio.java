package com.mycompany.rcbeautyok.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servicio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_servicio;
    @Basic
    private String manicure;
    private String pedicure;
    private String pestanias;
    private String faciales;

    public Servicio() {
    }

    public Servicio(int id_servicio, String manicure, String pedicure, String pestanias, String faciales) {
        this.id_servicio = id_servicio;
        this.manicure = manicure;
        this.pedicure = pedicure;
        this.pestanias = pestanias;
        this.faciales = faciales;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getManicure() {
        return manicure;
    }

    public void setManicure(String manicure) {
        this.manicure = manicure;
    }

    public String getPedicure() {
        return pedicure;
    }

    public void setPedicure(String pedicure) {
        this.pedicure = pedicure;
    }

    public String getPestanias() {
        return pestanias;
    }

    public void setPestanias(String pestanias) {
        this.pestanias = pestanias;
    }

    public String getFaciales() {
        return faciales;
    }

    public void setFaciales(String faciales) {
        this.faciales = faciales;
    }
    
    
}