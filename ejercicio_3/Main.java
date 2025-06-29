package ejercicio_3;

public class Main 
{
    public static void main(String[] args)
    {
        Carrito carrito = Carrito.getInstancia();

        carrito.agregarProducto(new Producto("Juego 1", 1500));
        carrito.agregarProducto(new Producto("Juego 2", 2300));

        carrito.mostrarProductos();

        System.out.println("Total a pagar: $" + carrito.calcularTotal());
    }
}