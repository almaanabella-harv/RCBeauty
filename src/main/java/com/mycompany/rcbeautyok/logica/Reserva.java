package com.mycompany.rcbeautyok.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Reserva implements Serializable {
    
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id_reserva;
  @Basic
  private String apellido_cliente;
  private String nombre_cliente;
  private char genero_cliente;
  private String telefono_cliente;
  private String hora;
  private String pago_senia;
  private String dia_reserva;
  private String mes_reserva;
  @OneToOne
  private Servicio unServicio;

    public Reserva() {
    }

    public Reserva(int id_reserva, String apellido_cliente, String nombre_cliente, char genero_cliente, String telefono_cliente, String hora, String pago_senia, String dia_reserva, String mes_reserva, Servicio unServicio) {
        this.id_reserva = id_reserva;
        this.apellido_cliente = apellido_cliente;
        this.nombre_cliente = nombre_cliente;
        this.genero_cliente = genero_cliente;
        this.telefono_cliente = telefono_cliente;
        this.hora = hora;
        this.pago_senia = pago_senia;
        this.dia_reserva = dia_reserva;
        this.mes_reserva = mes_reserva;
        this.unServicio = unServicio;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public char getGenero_cliente() {
        return genero_cliente;
    }

    public void setGenero_cliente(char genero_cliente) {
        this.genero_cliente = genero_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPago_senia() {
        return pago_senia;
    }

    public void setPago_senia(String pago_senia) {
        this.pago_senia = pago_senia;
    }

    public String getDia_reserva() {
        return dia_reserva;
    }

    public void setDia_reserva(String dia_reserva) {
        this.dia_reserva = dia_reserva;
    }

    public String getMes_reserva() {
        return mes_reserva;
    }

    public void setMes_reserva(String mes_reserva) {
        this.mes_reserva = mes_reserva;
    }

    public Servicio getUnServicio() {
        return unServicio;
    }

    public void setUnServicio(Servicio unServicio) {
        this.unServicio = unServicio;
    }

    

}