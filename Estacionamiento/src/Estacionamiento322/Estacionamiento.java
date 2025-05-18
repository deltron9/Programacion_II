package Estacionamiento322;

import java.util.ArrayList;

public class Estacionamiento {
    
    private final int maxCapacidad;
    private ArrayList<Auto> autos;
    
    public Estacionamiento(int capacidad) {
        autos = new ArrayList<Auto>();
        this.maxCapacidad = capacidad;
        
    }
}