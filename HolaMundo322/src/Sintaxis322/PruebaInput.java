package Sintaxis322;

import java.util.Scanner;

public class PruebaInput {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        String dato = input.next();
        
        int edad = Integer.parseInt(dato);
        
        if (edad >= 18) {
            System.out.println("Es Mayor");
        } else if (edad >= 1 && edad <= 17) {
            System.out.println("Es Menor");     
        } else {
            System.out.println("No nació jajaja");
        }
    }

}
