package autos322;

public class Autos {
    
    public static void main(String[] args) {
        Motor m1 = new Motor(12345, 2.0, "Nafta");
        
        Auto a1 = new Auto("A3F412", "Hyundai", "rojo", 2018, m1);
        
        System.out.println(a1);
    }
}
