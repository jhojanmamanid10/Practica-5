public class Main {

    public static void main(String[] args) {

        Empleado[] empleados = {
            new EmpleadoPorHora("Lucia", "E01", 20, 15),
            new EmpleadoFijo("Mario", "E02", 2800)
        };

        for (Empleado empleado : empleados) {

            System.out.printf(
                "%s: pago Bs %.2f%n",
                empleado.getNombre(),
                empleado.calcularPago()
            );
        }
    }
}