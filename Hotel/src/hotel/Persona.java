package hotel;

import java.util.ArrayList;


public class Persona {
    private String nombre;
    private String dni;
    private ArrayList<String> notificaciones;
    
    public Persona () {
        
    }
    
    public Persona(String nombre, String dni) {
        
    }
    
    public ArrayList<String> getNotificaciones() {
        return this.notificaciones
    }
    
    protected void agregarNotificaciones(String mensaje) {
        if (mensaje == null || mensaje.equals("")) {
            throw new IllegalArgumentException("MEnsaje nulo rey")
        }
            this.notificaciones.add(mensaje);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append
    }
}