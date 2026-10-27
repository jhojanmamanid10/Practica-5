public class Main {
    public static void main(String[] args) {

        Validator validador = new Validator();

        String[] pruebas = {
            "Jhojan2026",
            "Minecraft123",
            "Jhojan",
            "12345678",
            "Jhojan Mine",
            "Mine2026"
        };

        System.out.println("EJERCICIO 9: PRUEBAS DEL VALIDADOR");

        for (int i = 0; i < pruebas.length; i++) {
            String clave = pruebas[i];

            System.out.println(
                "Prueba " + (i + 1) + ": "
                + clave + " -> "
                + validador.esValida(clave)
            );
        }
    }
}