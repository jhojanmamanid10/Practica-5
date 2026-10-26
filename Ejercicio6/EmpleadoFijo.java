public class EmpleadoFijo extends Empleado {

    private double salarioMensual;

    public EmpleadoFijo(
            String nombre, String id, double salarioMensual) {

        super(nombre, id);

        this.salarioMensual = Math.max(0, salarioMensual);
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }
}