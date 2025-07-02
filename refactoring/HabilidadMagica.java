//Clase HabilidadMagica implementada (los datos para implementar los metodos fueron inventados)
public class HabilidadMagica extends TipoHabilidad
{
    @Override
    public double calcularDaño(double dañoBase)
    {
        return dañoBase * 1.2;
    }
    @Override
    public String descripcion(String nombre, double dañoBase)
    {
        return nombre + " es un mago con daño base " + dañoBase;
    }
}