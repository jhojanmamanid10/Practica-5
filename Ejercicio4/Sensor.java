public abstract class Sensor {

    protected String identificador;
    protected String ubicacion;

    public Sensor(String identificador, String ubicacion) {
        this.identificador = identificador;
        this.ubicacion = ubicacion;
    }

    public abstract String leer();
}