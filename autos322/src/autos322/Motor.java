package autos322;

public class Motor {
    
    private int nroSerie;
    private double cilindrada;
    private String tipoCombustible;
    private int rpm;

    public Motor(int nroSerie, double cilindrada, String tipoCombustible) {
        this.nroSerie = nroSerie;
        this.cilindrada = cilindrada;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "Motor{" + "nroSerie=" + nroSerie + ", cilindrada=" + cilindrada + ", tipoCombustible=" + tipoCombustible + '}';
    }
    
    
    
    
}
