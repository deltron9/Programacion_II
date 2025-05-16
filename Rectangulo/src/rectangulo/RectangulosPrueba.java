package rectangulo;

    public class RectangulosPrueba {
    
        public static void main(String[] args) {
        
            Rectangulo r1 = new Rectangulo(15, 17);
            Rectangulo r2 = new Rectangulo(13.5, 8.9);

//Quiero oder sumar dos rectangulos
//La suma de dos rectangulos es otro rectangulo
//Cuyo ancho es la suma del ancho de los rectangulos sumados y cuyo alto es la suma
//de los altos de los rectangulos

        Rectangulo r3 = r1.sumar(r2);
        Rectangulo r4 = Rectangulo.sumarRectangulos(r1, r3);
        
            System.out.println(r1);
            System.out.println(r2);
            System.out.println(r3);
            System.out.println(r4);
        
        }
}
