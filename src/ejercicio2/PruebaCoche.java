package ejercicio2;
public class PruebaCoche {
    public static void main(String[] args) {
        Coche c = new Coche("Toyota", "Corolla", 180);

        // Uso correcto: a traves de metodos publicos
        System.out.println("Marca: " + c.getMarca());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("Velocidad maxima: " + c.getVelocidadMaxima());

        c.acelerar(20);
        System.out.println("Tras acelerar 20: " + c.getVelocidadMaxima());
        c.acelerar(-10); // rechazado
        System.out.println("Tras acelerar -10: " + c.getVelocidadMaxima());

        // Acceso directo (descomenta para ver los errores de compilacion):
        // System.out.println(c.marca);            // error: marca has private access in Coche
        // System.out.println(c.modelo);           // error: modelo has private access in Coche
        // c.velocidadMaxima = 500;                // error: velocidadMaxima has private access in Coche
    }
}
