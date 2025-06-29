package ejercicio_3;
import java.util.ArrayList;
import java.util.List;

public class Carrito
{
    private static Carrito instancia;  // instancia única
    private List<Producto> productos;

    // Constructor privado
    private Carrito() {
        productos = new ArrayList<>();
    }

    // Método estático para obtener la instancia
    public static Carrito getInstancia() {
        if (instancia == null) {
            instancia = new Carrito();
        }
        return instancia;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void mostrarProductos() {
        System.out.println("Productos en el carrito:");
        for (Producto p : productos) {
            System.out.println("- " + p.getNombre() + " ($" + p.getPrecio() + ")");
        }
    }
}