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
        for (String clave : pruebas) {
            System.out.println(
                "Clave: " + clave + " -> "
                + validador.esValida(clave)
            );
        }
    }
}