public abstract class TipoHabilidad //Clase abstracta TipoHabilidad implementada para luego aplicar polimorfismo
{
	protected abstract double calcularDaño(double dañoBase);
	protected abstract String descripcion(String nombre, double dañoBase);
}