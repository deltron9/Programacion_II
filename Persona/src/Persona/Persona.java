package Persona;

import java.util.Scanner;

/*
Clase Persona:
o Desarrolla una clase Persona con los atributos nombre, edad, y altura (en metros).
o Implementa un método esMayorDeEdad() que devuelva true si la persona es mayor de 18 años.
o Agrega un método para calcular el índice de masa corporal (IMC) de la persona, dado su peso.
*/

public class Persona{
    private String nombre;
    private int edad;
    private double altura;
    
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        validarEdad(edad);
        this.edad = edad;
        this.altura = altura;
    }
    
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    
    public void validarEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("Edad invalida, tiene que ser mayor a 0");
        } 
    }
    
    public double calcularIMC(double pesoCorporal) {
    return pesoCorporal / (altura * altura);
    }
       
}
