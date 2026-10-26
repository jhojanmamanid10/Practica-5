public class EntregaBicicleta extends Entrega {

    public EntregaBicicleta(String codigo, double distanciaKm) {
        super(codigo, distanciaKm);
    }

    @Override
    public double calcularCosto() {
        return 3.0 + distanciaKm * 1.2;
    }
}