package com.mycompany.rcbeautyok.logica;

import com.mycompany.rcbeautyok.persistencia.ControladoraPersis;
import java.util.List;

public class Controladora {
    ControladoraPersis controlPersi = new ControladoraPersis();

    public void guardar(String nomCliente, String apelCliente, String tel, 
            String diaReserva, String mesReserva, String servicioReserva, 
            char genReserva, String horaReserva, String seniaReserva) {
        
        Servicio servicio = new Servicio();
        servicio.setManicure(servicioReserva);
        servicio.setPedicure(servicioReserva);
        servicio.setPestanias(servicioReserva);
        servicio.setFaciales(servicioReserva);
        
        Reserva reserva = new Reserva();
        reserva.setNombre_cliente(nomCliente);
        reserva.setApellido_cliente(apelCliente);
        reserva.setTelefono_cliente(tel);
        reserva.setDia_reserva(diaReserva);
        reserva.setMes_reserva(mesReserva);
        reserva.setGenero_cliente(genReserva);
        reserva.setHora(horaReserva);
        reserva.setPago_senia(seniaReserva);
        reserva.setUnServicio(servicio);
        
        controlPersi.guardar(servicio, reserva);
    
    }
 
    public List<Reserva> traerClientes() {
        return controlPersi.traerClientes();
    }
}