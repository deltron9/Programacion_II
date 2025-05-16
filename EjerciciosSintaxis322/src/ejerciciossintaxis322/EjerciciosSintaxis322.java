package ejerciciossintaxis322;

import java.util.Scanner;

public class EjerciciosSintaxis322 {

    public static void main(String[] args) {
        int empleadosConsignaUno = 0;
        int empleadosConsignaDos = 0;
        int edadMayor = 0;
        String nombreConsignaTres = "";
        int tecnologiaConsignaTres = 0 ;

        Scanner input = new Scanner(System.in);

        for (int ingresos = 0; ingresos < 10; ingresos++) {

            String retornoCarro = System.lineSeparator();

            System.out.print("Ingrese su nombre: ");
            String nombre = input.next();

            System.out.print("Ingrese su edad: ");
            int edad = input.nextInt();

            System.out.println("Ingrese su género: " + retornoCarro + "[1]Masculino" + retornoCarro + "[2]Femenino" + "[3]Otro");
            int genero = input.nextInt();

            System.out.println("Ingrese la tecnologia: " + retornoCarro + "[1]IA" + retornoCarro + "[2]RV/RA" + retornoCarro + "[3]IOT");
            System.out.print("Opción: ");
            int tecnologia = input.nextInt();

            if (tecnologia == 1 && edad >= 25 && edad <= 50) {
                empleadosConsignaUno++; }
            if (tecnologia != 1 && genero != 2 && (edad >= 33 && edad <= 40)) {
                empleadosConsignaDos++; }
            if (genero == 1 && edad > edadMayor) {
                nombreConsignaTres = nombre ;
                tecnologiaConsignaTres = tecnologia ;}
            
                
        }
        double porcentajeConsignaDos = ((double) empleadosConsignaDos / 10) + 100; 
        
        System.out.println(
                "Número de empleados que cumplen con la consigna: " + empleadosConsignaUno);
        
        System.out.println("Numero de empleados que cumplen con la consigna 2: " + empleadosConsignaDos + "y su porcentaje es: " + porcentajeConsignaDos + "%");
        
        System.out.println("El empleado con mayor edad es: " + nombreConsignaTres + "y la tecnologia que votó es: " + tecnologiaConsignaTres);
    } 
}