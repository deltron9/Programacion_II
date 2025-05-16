package televisor322;

public class Televisores {
    
    public static void main(String [] args) {
        Televisor tv1 = new Televisor("RCA", -32);
        
        Televisor tv2 = new Televisor("Phillips", 40);
/*
System.out.println("Marca: " + tv1.marca + "\nTamaño :" + tv1.tamanio + "\nCanal: " + tv1.canal + "\nVolumen: " + tv1.volumen + "\nEncendido: " + tv1.encendido);
System.out.println(tv1);
        
System.out.println("#####################################################");
        
System.out.println("Marca: " + tv2.marca + "\nTamaño :" + tv2.tamanio + "\nCanal: " + tv2.canal + "\nVolumen: " + tv2.volumen + "\nEncendido: " + tv2.encendido);
System.out.println(tv2); 
        
lo que aparece es la referencia: Paquete.nombredelaclase@hashcode
                       es decir:  televisor322.Televisor@5b480cf9
        
el hascode es el ID del objeto en memoria
java asocia este ID con toda la info del objeto (direccion de memoria real y todo lo que tiene el objeto)
        
Televisor tv1 = new Televisor();
Televisor tv2 = tv1;
        
va a mostrar el ID de un solo objeto ya que ambas variables 
apuntan al mismo lugar en memoria
        
System.out.println("Marca: " + tv1.mostrarMarca());
System.out.println("Marca: " + tv2.mostrarMarca());
        
aca usamos un metodo que muestra la marca porque no se accede directamente
*/

    }

}
