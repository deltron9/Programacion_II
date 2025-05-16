package Sintaxis322;

import java.util.Scanner;

public class promedioConPrompt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa promedio 1: ");
        int dato1 = input.nextInt();
        
        System.out.println("Ingresa promedio 2: ");
        int dato2 = input.nextInt();
                
        double resultado = promedio(dato1, dato2);
        System.out.println("El promedio es: " + resultado);
        
    }

    static double promedio(int dato1, int dato2) {
        return (double) (dato1 + dato2)/2;
}
}
