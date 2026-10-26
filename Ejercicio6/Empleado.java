public abstract class Empleado {

    private String nombre;
    private String identificador;

    public Empleado(String nombre, String identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public abstract double calcularPago();
}