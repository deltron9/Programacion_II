package integrador1posnet;

public class Cliente {
    private final String DNI;
    
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    
    public Cliente(String documento, String nombre, String apellido, String telefono, String email) {
        DNI = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
        
    }
    
}
