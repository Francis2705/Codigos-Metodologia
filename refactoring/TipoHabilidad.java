//clase abstracta TipoHabilidad implementada para luego aplicar polimorfismo
public abstract class TipoHabilidad {
	protected abstract double calcularDaño(double dañoBase);
	protected abstract String descripcion(String nombre, double dañoBase);
}