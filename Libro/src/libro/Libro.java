package libro;
/*
Clase Libro:
-. Diseña una clase Libro con atributos titulo, autor, numeroDePaginas, y paginaActual.
-. Implementa métodos para avanzar y retroceder páginas.
-. Crea un método que indique si el lector ha terminado de leer el libro.
*/
public class Libro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaActual;
    
    public Libro(String titulo, String autor, int numeroDePaginas, int paginaActual){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaActual = paginaActual;
    }
  
}
