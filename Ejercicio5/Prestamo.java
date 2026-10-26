public class Prestamo {

    private Libro libro;
    private Lector lector;
    private boolean activo = false;

    public Prestamo(Libro libro, Lector lector) {
        this.libro = libro;
        this.lector = lector;
    }

    public boolean registrarPrestamo() {

        if (activo || !libro.prestar()) {
            return false;
        }

        activo = true;

        System.out.println(
            lector.getNombre() + " recibe: "
            + libro.getTitulo()
        );

        return true;
    }

    public boolean registrarDevolucion() {

        if (!activo) {
            return false;
        }

        libro.devolver();
        activo = false;

        return true;
    }
}