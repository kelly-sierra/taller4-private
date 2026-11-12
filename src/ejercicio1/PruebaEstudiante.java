package ejercicio1;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Keli", 20, 4.5);
        System.out.println("Nombre: " + e1.getNombre());
        System.out.println("Edad: " + e1.getEdad());
        System.out.println("Nota promedio: " + e1.getNotaPromedio());

        System.out.println("\n--- Probando validaciones ---");
        e1.setEdad(-5);          // rechazada
        e1.setNotaPromedio(7.0); // rechazada
        e1.setNombre("   ");     // rechazado

        System.out.println("\n--- Actualizando con valores validos ---");
        e1.setEdad(21);
        e1.setNotaPromedio(4.8);
        System.out.println("Edad: " + e1.getEdad());
        System.out.println("Nota promedio: " + e1.getNotaPromedio());
    }
}
