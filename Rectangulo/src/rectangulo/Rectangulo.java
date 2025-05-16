package rectangulo;
/*
Clase Rectángulo:
o Crea una clase Rectángulo con atributos ancho y alto de tipo double.
o Implementa métodos para calcular el área y el perímetro del rectángulo.
o Escribe un método esCuadrado() que devuelva true si el rectángulo es un cuadrado, es decir, si
ancho y alto son iguales.
*/
public class Rectangulo {
    private final double ancho;
    private final double alto;
    
    public Rectangulo(double ancho, double alto) {
        validarIngreso(ancho);
        validarIngreso(alto);
        this.alto = alto;
        this.ancho = ancho;
    }
    
    private void validarIngreso(double ingreso) {
        if(ingreso < 1) {
            throw new IllegalArgumentException("Ingreso de tipo double inválido.");
        }
    }
    
    public double calcularArea() {
        return ancho * alto;
    }
    
    public double calcularPerimetro() {
        return (ancho + alto) * 2;
    }
    
    public boolean esCuadrado(double alto, double ancho) {
        return ancho == alto;
    }
    
    //Solución mía - Malarda
    public double sumarRecta(double r1, double r2) {
        return r1 + r2;
    }
    
    //Solución POO de Baus
    public Rectangulo sumar(Rectangulo o) {
        return new Rectangulo(this.ancho + o.ancho, this.alto + o.alto);
    }
    //
    
    //2da solución Baus (La más perfecta)
    public static Rectangulo sumarRectangulos(Rectangulo r1, Rectangulo r2) {
        return r1.sumar(r2);
    }
    
    public double getBase() {
        return ancho;
    }
    
    public double getAltura() {
        return alto;
    }
    
    public double getArea() {
    return calcularArea();
    }
    
    public double getPerimetro() {
    return calcularPerimetro();
    }
    
    @Override
    public String toString() {
        return "Rectangulo: Ancho: " + ancho + " Alto: " + alto;
    }
}
