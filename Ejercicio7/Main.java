class CuentaDigital {
    private String titular;
    private double saldo;
    public CuentaDigital(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public boolean depositar(double monto) {
        if (monto <= 0) {
            return false;
        }
        saldo += monto;
        return true;
    }
    public boolean retirar(double monto) {
        if (monto <= 0 || monto > saldo) {
            return false;
        }
        saldo -= monto;
        return true;
    }
    public double getSaldo() {
        return saldo;
    }
}
public class Main {
    public static void main(String[] args) {
        CuentaDigital cuenta = new CuentaDigital("Carlos", 500);
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        System.out.println("Deposito correcto: "
                + cuenta.depositar(200));
        System.out.println("Retiro correcto: "
                + cuenta.retirar(100));
        System.out.println("Deposito invalido: "
                + cuenta.depositar(-50));
        System.out.println("Retiro sin fondos: "
                + cuenta.retirar(1000));
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}