public class SensorHumedad extends Sensor {

    private double humedad;

    public SensorHumedad(
            String id, String ubicacion, double humedad) {

        super(id, ubicacion);
        this.humedad = humedad;
    }

    @Override
    public String leer() {

        return identificador + " (" + ubicacion + "): "
                + humedad + "% de humedad";
    }
}