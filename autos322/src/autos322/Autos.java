package autos322;

public class Autos {
    
    public static void main(String[] args) {
        
        Auto a1 = new Auto("A3F412", "Hyundai", Color.BLANCO, 2018, new Motor(12345, 1.5, TipoCombustible.NAFTA));
        
        System.out.println(a1);
    }
}
