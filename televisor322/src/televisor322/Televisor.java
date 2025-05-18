package televisor322;

public class Televisor {

    /*Atributos*/
 /*
Los atributos y métodos de una clase se denominan miembros, son los miembros de la clase
a estos miembros le podemos dar un atributo de visibilidad (Private o Public)
    

    String marca;
    private double tamanio; aca al ser privado no se puede acceder desde tv.tamanio por ejm
    int canal;              no se puede ni leer ni escribir el tamaño
    int volumen;            si yo no especifico visibilidad por default se pone Public
    boolean encendido;      se dice que hay visibilidad de paquete
     */

 /*    private String marca;
    private double tamanio;
    private int canal;          Acá está todo encapsulado
    private int volumen;
    private boolean encendido;
    
     */
    private static int INITIAL_CANAL = 1;
    private static int CANAL_MAX = 80;
    private static int CANAL_MIN = 1;
    private static int VOL_MAX = 100;
    private static int VOL_MIN = 0;
    private static int nextNroDeSerie = 10000;

    private String marca;
    private double tamanio;
    private int canal;
    private int volumen;
    private boolean encendido;
    private final int nroSerie;

    /*Metodos
    public Televisor() {       si no lo colocamos, java lo pone por default asi vacío
        
        El constructor se usa para dos cosas:
        -para conseguir espacio en memoria para el objeto
        -para darle valor inicial a los atributos

    } 
     */
    public Televisor(String marca, double tamanio) {
        this.marca = marca;
        /*        
        if (t >= 0) esto esta mal porque este metodo hace demasiado ya
        tamanio = t;
         */
        validarTamanio(tamanio);
        this.tamanio = tamanio;
        canal = INITIAL_CANAL;
        volumen = (VOL_MAX + VOL_MIN) / 2;
        nroSerie = nextNroDeSerie++;
    }

    private boolean validarTamanio(double tam) {
        if (tam <= 0) {
            throw new IllegalArgumentException("Tamaño Inválido");
        }
        return true;
    }

    public String setMarca() {
        return marca;
    }

    public int getNroDeSerie() {
        return nroSerie;
    }

    public void getInfo() {
        System.out.println("Marca: " + marca + "\nTamaño :" + tamanio
                + "\nCanal: " + canal + "\nVolumen: " + volumen
                + "\nEncendido: " + encendido);
        System.out.println("--------------------------------------------------");
    }

    public void subirCanal() {
        canal++;
        getCanal();
    }

    public void bajarCanal() {
        canal--;
        getCanal();
    }

    public void setCanal(int canalNuevo) {
        validarEncendido();
        validarCanal(canalNuevo);
        canal = canalNuevo;
        getCanal();
    }
    
    private void validarEncendido() {
        if (!encendido) {
            throw new IllegalStateException("Television Apagada");
        }
    }

    private void validarCanal(int canal) {
        if (canal < CANAL_MIN || canal > CANAL_MAX) {
            throw new IllegalArgumentException("Canal fuera de rango");
        }
    }

    /*   
    private void validarCanal() {
        if !(canal >= CANAL_MIN && canal <= CANAL_MAX) {
            throw new IllegalArgumentException("Canal fuera de rango");
        }    
    }
     */

    private void getCanal() {
        System.out.println("TV Marca: " + marca + "\nCanal: " + canal);
    }

    public void encenderTelevision() {
        if (!encendido) {
            encendido = true;
        } else {
            System.out.println("La television se encendió");
        }
    }

    public void apagarTelevision() {
        if (encendido) {
            encendido = false;
        } else {
            System.out.println("La television se apagó"); 
        }
    }
}
