public class CuentaDigital {

    private String titular;
    private String identificador;
    private double saldo;

    public CuentaDigital(String titular, String identificador,
                         double saldoInicial) {
        this.titular = titular;
        this.identificador = identificador;
        this.saldo = Math.max(0, saldoInicial);
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

    public double consultarSaldo() {
        return saldo;
    }

    public void mostrarEstado() {
        System.out.printf(
            "Titular: %s | Cuenta: %s | Saldo: Bs %.2f%n",
            titular, identificador, saldo
        );
    }
}