public class Main {

    public static void main(String[] args) {

        Sensor[] sensores = {
            new SensorTemperatura("T-01", "Sector A", 24.5),
            new SensorHumedad("H-01", "Sector B", 61.0)
        };

        for (Sensor sensor : sensores) {

            System.out.println(sensor.leer());

            if (sensor instanceof Calibrable) {

                ((Calibrable) sensor).calibrar();
            }
        }
    }
}