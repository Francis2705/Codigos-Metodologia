//Clase HabilidadCuerpoACuerpo implementada (los datos para implementar los metodos fueron inventados)
public class HabilidadCuerpoACuerpo extends TipoHabilidad
{
    @Override
    public double calcularDaño(double dañoBase)
    {
        return dañoBase * 1.1;
    }
    @Override
    public String descripcion(String nombre, double dañoBase)
    {
        return nombre + " es un guerrero con daño base " + dañoBase;
    }
}