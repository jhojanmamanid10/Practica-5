public class EmpleadoPorHora extends Empleado {

    private double horas;
    private double tarifa;

    public EmpleadoPorHora(
            String nombre, String id,
            double horas, double tarifa) {

        super(nombre, id);

        this.horas = Math.max(0, horas);
        this.tarifa = Math.max(0, tarifa);
    }

    @Override
    public double calcularPago() {
        return horas * tarifa;
    }
}