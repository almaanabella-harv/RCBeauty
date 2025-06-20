package com.mycompany.rcbeautyok.persistencia;

import com.mycompany.rcbeautyok.logica.Reserva;
import com.mycompany.rcbeautyok.logica.Servicio;

public class ControladoraPersis {
    ReservaJpaController clienteJpa = new ReservaJpaController();
    ServicioJpaController serviceJpa = new ServicioJpaController();

    public void guardar(Servicio servicio, Reserva reserva) {
        //crear en la BD una reserva
        clienteJpa.create(reserva);
        //crear en la BD un servicio
        serviceJpa.create(servicio);
    }
}
