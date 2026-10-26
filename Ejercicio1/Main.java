public class Main {

    public static void main(String[] args) {

        CuentaDigital cuenta = new CuentaDigital(
            "Ana Lopez", "CTA-001", 100.0
        );

        System.out.println(
            "Deposito de Bs 50: " + cuenta.depositar(50)
        );

        System.out.println(
            "Retiro de Bs 30: " + cuenta.retirar(30)
        );

        System.out.println(
            "Deposito de Bs 0: " + cuenta.depositar(0)
        );

        System.out.println(
            "Retiro de Bs 500: " + cuenta.retirar(500)
        );

        cuenta.mostrarEstado();
    }
}