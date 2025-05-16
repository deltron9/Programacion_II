package Sintaxis322;

public class PruebaEquivalenteAFunciones {

    public static void main(String[] args) {
       int n1 = 4;
       int n2 = 6;
       int resultado = sumar(n1, n2);
       
        System.out.println("La suma es " + resultado);
    }
    static int sumar(int a, int b) {
        return a + b;
    }
}

/** str + number o number + str o str + str = str**/