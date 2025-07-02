public class Personaje
{
	private String nombre;
	private double dañoBase;
	private TipoHabilidad tipoHabilidad;

	public Personaje(String nombre, double dañoBase, TipoHabilidad tipoHabilidad)
	{
		this.nombre = nombre;
		this.dañoBase = dañoBase;
		this.tipoHabilidad = tipoHabilidad;
	}
	public double calcularDaño()
	{
		return tipoHabilidad.calcularDaño(dañoBase);
	}
	public String getDescripcion()
	{
		return tipoHabilidad.descripcion(nombre, dañoBase);
	}
}