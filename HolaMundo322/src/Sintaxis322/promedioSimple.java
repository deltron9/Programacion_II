package Sintaxis322;

public class promedioSimple {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double resultado = promedio(a, b);
        System.out.println("El promedio es: " + resultado);
    }
    static double promedio(int a, int b) {
        return (double) (a + b)/2;
    }
}
