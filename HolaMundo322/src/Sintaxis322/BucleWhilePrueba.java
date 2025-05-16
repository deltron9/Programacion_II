package Sintaxis322;

public class BucleWhilePrueba {

    public static void main(String[] args) {
        int x = 1;

        while (x <= 10) {
            System.out.println(x);
            x++;
        }
        System.out.println("El once esta fuera del bucle "); /**esto esta fuera del bucle por ende va a mostar el 11**/
        System.out.println(x);
    }
}
/**como vienen diciendo siempre: usar el while solo cuando 
 * no se sabe la cantidad de iteraciones, si se sabe, usar for**/