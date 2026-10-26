public class SensorTemperatura extends Sensor
        implements Calibrable {

    private double temperatura;

    public SensorTemperatura(
            String id, String ubicacion, double temperatura) {

        super(id, ubicacion);
        this.temperatura = temperatura;
    }

    @Override
    public String leer() {

        return identificador + " (" + ubicacion + "): "
                + temperatura + " grados C";
    }

    @Override
    public void calibrar() {

        System.out.println(
            "Sensor de temperatura calibrado."
        );
    }
}