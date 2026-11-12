package ejemplo5;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto prod = new Producto(100);
        System.out.println("Precio inicial: " + prod.getPrecio());

        prod.actualizarPrecio(-50); // compila y se acepta: ese es el problema
        System.out.println("Precio tras actualizar a -50: " + prod.getPrecio());
    }
}