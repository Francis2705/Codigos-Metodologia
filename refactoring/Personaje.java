//clase Personaje implementada
public class Personaje {
	private String nombre;
	private double dañoBase;
	private TipoHabilidad tipoHabilidad;

	public double calcularDaño() {
		return tipoHabilidad.calcularDaño(dañoBase);
	}

	public String getDescripcion() {
		return tipoHabilidad.descripcion(nombre, dañoBase);
	}
}