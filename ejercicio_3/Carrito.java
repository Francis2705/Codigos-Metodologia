package ejercicio_3;
import java.util.ArrayList;
import java.util.List;

public class Carrito
{
    private static Carrito instancia; //Instancia unica
    private List<Producto> productos;

    private Carrito() //Constructor privado
    {
        productos = new ArrayList<>();
    }

    public static Carrito getInstancia() //Get para obtener la instancia actual
    {
        if (instancia == null)
        {
            instancia = new Carrito();
        }
        return instancia;
    }

    public void agregarProducto(Producto producto)
    {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public double calcularTotal()
    {
        double total = 0;
        for (Producto p : productos)
        {
            total += p.getPrecio();
        }
        return total;
    }

    public void mostrarProductos()
    {
        System.out.println("Productos en el carrito:");
        for (Producto p : productos)
        {
            System.out.println("- " + p.getNombre() + " ($" + p.getPrecio() + ")");
        }
    }
}