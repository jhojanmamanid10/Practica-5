public class Main {

    public static void main(String[] args) {

        Entrega[] entregas = {
            new EntregaBicicleta("E-01", 5),
            new EntregaAutomovil("E-02", 5)
        };

        for (Entrega entrega : entregas) {

            System.out.printf(
                "%s: Bs %.2f%n",
                entrega.getCodigo(),
                entrega.calcularCosto()
            );
        }

        System.out.printf(
            "Bicicleta con recargo: Bs %.2f%n",
            entregas[0].calcularCosto(3.0)
        );
    }
}