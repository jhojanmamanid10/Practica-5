public class Pedido {

    private Producto[] productos = new Producto[3];
    private int cantidad = 0;

    public boolean agregarProducto(Producto producto) {

        if (producto == null || cantidad >= productos.length) {
            return false;
        }

        if (producto.getPrecio() <= 0) {
            return false;
        }

        productos[cantidad] = producto;
        cantidad++;

        return true;
    }

    public double calcularSubtotal() {

        double subtotal = 0;

        for (int i = 0; i < cantidad; i++) {
            subtotal += productos[i].getPrecio();
        }

        return subtotal;
    }

    public double calcularTotal() {
        return calcularSubtotal();
    }

    public void mostrarPedido() {

        System.out.println("PEDIDO DE CAFETERIA");
        System.out.println("-------------------");

        for (int i = 0; i < cantidad; i++) {

            System.out.printf(
                "%s - Bs %.2f%n",
                productos[i].getNombre(),
                productos[i].getPrecio()
            );
        }

        System.out.printf(
            "Subtotal: Bs %.2f%n", calcularSubtotal()
        );

        System.out.printf(
            "Total: Bs %.2f%n", calcularTotal()
        );
    }
}