public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        Producto p1 = new Producto("Cafe", 12.50);
        Producto p2 = new Producto("Sandwich", 18.00);
        Producto p3 = new Producto("Jugo", 8.00);

        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        pedido.mostrarPedido();
    }
}