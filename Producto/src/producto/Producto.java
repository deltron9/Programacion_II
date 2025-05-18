package producto;

/**
8. Clase Producto:
o Desarrolla una clase Producto con atributos nombre, precio, y cantidadEnStock.
o Crea un método para aplicar un descuento al precio del producto.
o Implementa un método para realizar una venta, actualizando la cantidad en stock y verificando 
que haya suficiente stock disponible.
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;
    
    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }
    
    public String realizarVenta(int cantidadDeVenta) {
        validarVenta(cantidadDeVenta);
        validarStock(cantidadDeVenta);
        this.cantidadEnStock -= cantidadDeVenta;
        return mensajeVentaRealizada();
    }
    
    private String mensajeVentaRealizada() {
        return "Venta realizada con éxito!";
    }
    
    private void validarStock(int cantidad_stock) {
        if (cantidad_stock < this.cantidadEnStock) {
            throw new IllegalStateException("Cantidad de stock insuficiente, consultar stock.");
        }
    }
    
    private void validarVenta(int var_cant) {
        if (var_cant < 0) {
            throw new IllegalArgumentException("Error: valor de venta inválido.");
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }
}
