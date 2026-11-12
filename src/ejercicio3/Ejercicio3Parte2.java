package ejercicio3;
// Parte 2: atributo private SIN get/set
class Usuario {
    private String clave;

    public Usuario(String clave) {
        this.clave = clave;
    }
    // No hay getClave() ni setClave(): ni se puede consultar ni cambiar desde fuera.
}

public class Ejercicio3Parte2 {
    public static void main(String[] args) {
        Usuario u = new Usuario("1234");
        // Desde aqui es imposible leer o actualizar 'clave'.
        // Compila sin errores, pero la clase es poco util.
        System.out.println("Usuario creado, pero su clave es inaccesible.");
    }
}

/*
 DISCUSION: como afecta a la proteccion de datos
 - Proteccion maxima pero funcionalidad nula: el dato queda encapsulado, aunque
   ningun otro objeto puede leerlo ni corregirlo si se ingreso mal.
 - Si faltan solo los set, el atributo queda "de solo lectura" (util para ids).
 - Si el atributo se necesita fuera, lo correcto es exponerlo con get/set
   y validaciones, no quitar private ni dejar la clase sin interfaz.
 - Ojo: tener get/set sin validaciones (como actualizarPrecio en el taller)
   tambien rompe la proteccion, aunque el atributo sea private.
*/