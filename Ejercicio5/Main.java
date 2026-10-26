public class Main {

    public static void main(String[] args) {

        Libro libro = new Libro("El principito");
        Lector lector = new Lector("Carlos");

        Prestamo prestamo = new Prestamo(libro, lector);

        System.out.println(
            "Primer prestamo: "
            + prestamo.registrarPrestamo()
        );

        System.out.println(
            "Intento repetido: "
            + prestamo.registrarPrestamo()
        );

        System.out.println(
            "Devolucion: "
            + prestamo.registrarDevolucion()
        );

        System.out.println(
            "Libro disponible: "
            + libro.estaDisponible()
        );
    }
}