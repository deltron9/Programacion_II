package autos322;
  
public class Auto {
    private String patente;
    private String marca;
    private String color;
    private int modelo;
    private Motor motor;
    
    public Auto(String patente, String marca, String color, int modelo, Motor motor) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", motor=" + motor + '}';
    }
    
    
        
}
 