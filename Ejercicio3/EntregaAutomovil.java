public class EntregaAutomovil extends Entrega {

    public EntregaAutomovil(String codigo, double distanciaKm) {
        super(codigo, distanciaKm);
    }

    @Override
    public double calcularCosto() {
        return 8.0 + distanciaKm * 2.5;
    }
}