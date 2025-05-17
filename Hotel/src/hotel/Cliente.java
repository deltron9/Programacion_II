package Hotel;

import java.utils.ArrayList;

public class Cliente extends Persona {
    
    private String mail;
    private ArrayList<Reserva> reservas;
    
    public Cliente(String nombre, String dni, String mail) {
        super(nombre, dni);
        this.email = email;
        this.reservas = new ArrayList<>();
    }
    
    public ArrayList<Reserva> getReservas() {
        return this.reservas;
    }
    
    public String getMail() {
        return this.mail;
    }
    
    //public void realizarReserva(Hotel hotel, habitacion) {
    //
    //}
    
    @Override
    public void notificar(String notificacion) {
        this.agregarNotificacion(notificacion);
    }
}
