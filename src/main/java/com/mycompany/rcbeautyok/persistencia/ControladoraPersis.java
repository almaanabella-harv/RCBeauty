package com.mycompany.rcbeautyok.persistencia;

import com.mycompany.rcbeautyok.logica.Reserva;
import com.mycompany.rcbeautyok.logica.Servicio;
import java.util.List;

public class ControladoraPersis {
    ReservaJpaController clienteJpa = new ReservaJpaController();
    ServicioJpaController serviceJpa = new ServicioJpaController();

     public void guardar(Servicio servicio, Reserva reserva) {
        try {
            // 1) Persistir primero el servicio
            serviceJpa.create(servicio);  // ahora servicio tiene id generado

            // 2) Asignar al objeto reserva el servicio ya persistido
            reserva.setUnServicio(servicio);

            // 3) Persistir la reserva
            clienteJpa.create(reserva);

            System.out.println("Guardado exitoso: Servicio ID=" 
                + servicio.getId_servicio() 
                + ", Reserva ID=" + reserva.getId_reserva());
        } catch (Exception ex) {
            // Opcional: rethrow o notificar al usuario según necesidad
            
        }
    }

    public List<Reserva> traerClientes() {
        
        return clienteJpa.findReservaEntities();
    }

}
