//clase HabilidadCuerpoACuerpo y HabilidadMagica implementada (los datos para implementar los metodos, 
// al no saberlos, los creamos nosotros)

//HabilidadCuerpoACuerpo
public class HabilidadCuerpoACuerpo extends TipoHabilidad {
    @Override
    public double calcularDaño(double dañoBase) {
        return dañoBase * 1.1;
    }
    @Override
    public String descripcion(String nombre, double dañoBase) {
        return nombre + " es un guerrero con daño base " + dañoBase;
    }
}