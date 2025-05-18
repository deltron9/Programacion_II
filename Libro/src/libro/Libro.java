package libro;

/*
Clase Libro:
-. Diseña una clase Libro con atributos titulo, autor, numeroDePaginas, y paginaActual.
-. Implementa métodos para avanzar y retroceder páginas.
-. Crea un método que indique si el lector ha terminado de leer el libro.
 */
public class Libro {

    private final String titulo;
    private final String autor;
    private final int numeroDePaginas;
    private int paginaActual;

    public Libro(String titulo, String autor, int numeroDePaginas, int paginaActual) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaActual = paginaActual;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantidadDePaginas() {
        return numeroDePaginas;
    }

    public int getPaginaActual() {
        return this.paginaActual;
    }

    public void avanzarPagina(int paginas) {
        if (paginas > numeroDePaginas) {
            throw new IllegalArgumentException("Sobrepasas la cantidad de páginas del libro.");
        } else if (paginaActual == numeroDePaginas) {
            informarLibroTerminado();
        }
        this.paginaActual += paginas;
    }

    public void retrocederPagina(int paginas) {
        if (paginas <= 1) {
            throw new IllegalArgumentException("numero de pagina inválido.");
        }
        this.paginaActual -= paginas;
    }

    public String informarLibroTerminado() {
        return "Libro terminado.";
    }
}
