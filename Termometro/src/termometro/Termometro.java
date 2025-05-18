package termometro;

/**
 * 7. Clase Termómetro: o Crea una clase Termómetro con un atributo temperatura
 * de tipo double. o Escribe métodos para convertir la temperatura de grados
 * Celsius a Fahrenheit y viceversa. o Implementa un método que permita aumentar
 * o disminuir la temperatura en un valor dado.
 */
public class Termometro {

    private double temperatura;

    public Termometro(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double convertirEnFahrenheit(double temperatura) {
        return this.temperatura = (temperatura * 9 / 5) + 32;
    }

    public double convertirEnCelcius(double temperatura) {
        return this.temperatura = (temperatura - 32) * 5 / 9;
    }

    public double aumentarTemperatura(double temperatura) {
        if (temperatura > 0) {
            return this.temperatura + temperatura;
        } else if (temperatura < 0) {
            throw new IllegalArgumentException("Tenés que pasar un valor positivo para poder incrementar la temperatura");
        }
        return temperatura;
    }
    
    public double disminuirTemperatura(double temperatura) {
        if (temperatura < 0) {
            return this.temperatura - temperatura;
        } else if (temperatura > 0) {
            throw new IllegalArgumentException("Tenés que pasar un valor positivo para poder disminuir la temperatura");
        }
        return temperatura;
    }

}
