public class Main {

    public static void main(String[] args) {

        ValidadorClave validador = new ValidadorClave();

        String[] pruebas = {
            "Sol12345",
            "sol12345",
            "Sol 12345",
            "Solab7",
            "ClaveFuerte9"
        };

        for (String prueba : pruebas) {

            System.out.println(
                "\"" + prueba + "\" -> "
                + validador.esValida(prueba)
            );
        }
    }
}