package Sintaxis322;

import java.util.Scanner;

public class SwitchCasePrueba {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Cuantas Patas tenés?");
        int cantidad = numero.nextInt();

        switch (cantidad) {
            case 1:
                System.out.println("Tenés 1");
                break;
            case 2:
                System.out.println("Tenes 2 rey");
                break;
            case 3:
                System.out.println("Tenés 3 rey, una banda");
                break;
            default:
                System.out.println("No tengo info si tenes esa cantidad rey");
        }

    }
}