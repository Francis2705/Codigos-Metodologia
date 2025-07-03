package ejercicio_4;

public class Cafe extends BebidaCaliente
{
    @Override
    protected void agregarProducto()
    {
        System.out.println("poniendo cafe molido en la taza");
    }
    @Override
    protected void realizarUltimaAccion()
    {
        System.out.println("agregando azucar al gusto");
    }
}
