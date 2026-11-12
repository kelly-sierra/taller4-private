package ejemplo1;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        cuenta.depositar(500);
        System.out.println("Tras depositar 500: " + cuenta.getSaldo());

        cuenta.depositar(-200);
        System.out.println("Tras depositar -200: " + cuenta.getSaldo());
    }
}