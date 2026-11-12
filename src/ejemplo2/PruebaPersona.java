package ejemplo2;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Juan", 25);
        System.out.println(p.getNombre() + " - " + p.getEdad());

        p.setNombre("Carlos");
        p.setEdad(30);
        System.out.println(p.getNombre() + " - " + p.getEdad());

        p.setEdad(-10);
        System.out.println("Edad tras setEdad(-10): " + p.getEdad());
    }
}