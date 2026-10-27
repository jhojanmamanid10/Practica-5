public class Validator {
    public boolean esValida(String clave) {
        if (clave == null || clave.length() < 8
                || clave.contains(" ")) {
            return false;
        }
        boolean tieneLetra = false;
        boolean tieneNumero = false;
        for (int i = 0; i < clave.length(); i++) {
            char caracter = clave.charAt(i);
            if (Character.isLetter(caracter)) {
                tieneLetra = true;
            }
            if (Character.isDigit(caracter)) {
                tieneNumero = true;
            }
        }
        return tieneLetra && tieneNumero;
    }
}