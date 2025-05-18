package autos322;
  
public class Auto {
    private String patente;
    private String marca;
    private Color color;
    private int modelo;
    private Motor motor;
    
    public Auto(String patente, String marca, Color color, int modelo, Motor motor) {
        validarMotor(motor);
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
    }
    
    private void validarMotor(Motor motor) {
        if (motor == null) {
            throw new NullPointerException("Motor nulo rey.");
                    
        }
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", motor=" + motor + '}';
    }
    
    
        
}
 