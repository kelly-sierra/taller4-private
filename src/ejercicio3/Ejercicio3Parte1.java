package ejercicio3;
// Parte 1: acceso directo a un atributo private desde otra clase
class Mascota {
    private String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }
}

public class Ejercicio3Parte1 {
    public static void main(String[] args) {
        Mascota m = new Mascota("Luna");
        // System.out.println(m.nombre);
        // ERROR DE COMPILACION: nombre has private access in Mascota
        // (solo se puede usar dentro de la clase Mascota)
    }
}
