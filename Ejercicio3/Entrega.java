public abstract class Entrega {

    private String codigo;
    protected double distanciaKm;

    public Entrega(String codigo, double distanciaKm) {
        this.codigo = codigo;
        this.distanciaKm = Math.max(0, distanciaKm);
    }

    public String getCodigo() {
        return codigo;
    }

    public abstract double calcularCosto();

    public double calcularCosto(double recargo) {
        return calcularCosto() + Math.max(0, recargo);
    }
}