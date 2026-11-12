package ejemplo5;

public class Producto {
    private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    // Mala práctica: no valida nada, acepta precios negativos
    public void actualizarPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
    }
}