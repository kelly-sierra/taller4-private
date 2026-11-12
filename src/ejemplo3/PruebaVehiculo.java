package ejemplo3;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Mazda", 60);
        System.out.println(v.getMarca() + " a " + v.getVelocidad() + " km/h");

        v.acelerar(30);
        System.out.println("Tras acelerar 30: " + v.getVelocidad());

        v.acelerar(-15);
        System.out.println("Tras acelerar -15: " + v.getVelocidad());
    }
}