public class Libro {

    private String titulo;
    private boolean disponible = true;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public boolean prestar() {

        if (!disponible) {
            return false;
        }

        disponible = false;
        return true;
    }

    public void devolver() {
        disponible = true;
    }
}