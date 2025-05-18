package autos322;

public class Motor {
    
    private int nroSerie;
    private double cilindrada;
    private TipoCombustible tipoCombustible;
    private int rpm;

    public Motor(int nroSerie, double cilindrada, TipoCombustible tipoCombustible) {
        this.nroSerie = nroSerie;
        this.cilindrada = cilindrada;
        this.tipoCombustible = tipoCombustible;
    }
    
    public void setTipoCombustible(TipoCombustible nuevoCombustible) {
        tipoCombustible = nuevoCombustible;
    }
    
    public void acelerar() {
        rpm += 1000;
    }

    @Override
    public String toString() {
        return "Motor{" + "nroSerie=" + nroSerie + ", cilindrada=" + cilindrada + ", tipoCombustible=" + tipoCombustible + '}';
    }
    
}
