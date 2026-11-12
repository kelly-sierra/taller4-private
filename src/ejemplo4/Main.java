package ejemplo4;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");

        // Descomenta la línea siguiente para ver el error de compilación:
         System.out.println(p.nombre); // Error: nombre tiene acceso privado
//
        System.out.println("Persona creada. El atributo nombre es privado.");
    }
}