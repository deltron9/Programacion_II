package Sintaxis322;

import java.util.Scanner;

public class SwitchCaseString {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.print("¿Como se llama el ninja rojo de mortal kombat? respuesta: ");

        String nombre = ingreso.next();

        switch (nombre) {
            case "Noob Saibot":
                System.out.println("No, no es Noob Saibot, ese es negro");
                break;
            case "Rain":
                System.out.println("No, No es Rain, ese es violeta.");
                break;
            case "Scorpion":
                System.out.println("No, ese es amarillo");
                break;
            case "Ermac":
                System.out.println("Correcto!");
                break;
        }
    }
}
