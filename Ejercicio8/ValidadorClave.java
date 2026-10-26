public class ValidadorClave {

    public boolean esValida(String clave) {

        if (clave == null || clave.length() < 8) {
            return false;
        }

        if (clave.contains(" ")) {
            return false;
        }

        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numero = false;

        for (int i = 0; i < clave.length(); i++) {

            char c = clave.charAt(i);

            if (Character.isUpperCase(c)) {
                mayuscula = true;
            }

            if (Character.isLowerCase(c)) {
                minuscula = true;
            }

            if (Character.isDigit(c)) {
                numero = true;
            }
        }

        return mayuscula && minuscula && numero;
    }
}