package coche;
/*
Clase Coche:
-.Crea una clase Coche con atributos marca, modelo, kilometraje, y combustibleRestante (en
litros).
-.Escribe un método para calcular cuántos kilómetros puede recorrer el coche con el
combustible restante, considerando un consumo fijo de combustible por kilómetro.
-.Implementa un método para "recargar" el combustible del coche.
*/


public class Coche {
    private String marca;
    private String modelo;
    private double kilometraje;
    private double combustibleRestante;
    
    private final double CONSUMO_POR_KILOMETRO = 0.1;
    
    public Coche(String marca, String modelo, double kilometraje, double combustibleRestante) {
        this.kilometraje = kilometraje;
        this.marca = marca;
        this.modelo = modelo;
        this.combustibleRestante = combustibleRestante;
    }
    
    public double calcularKilometrosARecorrer() {
        return combustibleRestante / CONSUMO_POR_KILOMETRO;
    }
    
    public void recargarCombustible(double litros) {
        combustibleRestante += litros;
    }
    
    public String getCombustible() {
        return "Actualmente hay " + combustibleRestante + " litros de combustible.";
    }
}
