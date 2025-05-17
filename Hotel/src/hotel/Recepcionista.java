package Hotel;

import java.util.ArrayList;

public class Recepcionista extends Persona {
    private String legajo;
    
    public Recepcionista (String nombre, String dni, String) {
        super(nombre, dni);
        this.legajo = legajo;
    }
    
    public String getLegajo() {
        return this.legajo;
    }
    
    public void confirmarReserva(Reserva reserva, Hotel hotel){
        
    }
    
    public void notificar(String notificacion) {
        this.agregarNotificacion(notificacion);
    }
}
