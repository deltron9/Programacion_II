package circulo;
/*
Clase Círculo:
o Define una clase Círculo con un atributo radio de tipo double.
o Crea métodos para calcular el área y la circunferencia del círculo.
o Implementa un método para escalar el círculo, aumentando o disminuyendo su radio en un
porcentaje dado.
*/
        
public class Circulo {
    
    private double radio;     
    
    public Circulo(double radio) {
    
    }
    
    public double calcularArea(double radio) {
        return 3.1416 * (radio * radio);
    }
    
    public double calcularCircunferencia(double radio) {
        return 2 * 3.1416 * radio;
    }
    
    public double escalarCirculo(double porcentaje) {
        return radio * (1 + porcentaje / 100);
    }
    
    public double getRadio() {
    return radio;
    }
}
