import java.util.List;

public class Videojuego
{
	private String nombre;
	private List<Personaje> personajes;

	public Personaje personajeConMasDaño()
	{
		Personaje personajeMax = null;
		double maxDaño = 0;
		for (Personaje p : personajes)
		{
			double daño = p.calcularDaño();
			if (daño > maxDaño || personajeMax == null)
			{
				personajeMax = p;
				maxDaño = daño;
			}
		}
		return personajeMax;
	}

	public void imprimirInfo(Personaje p)
	{
		System.out.println(p.getDescripcion());
	}

	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public void setPersonajes(List<Personaje> personajes)
	{
		this.personajes = personajes;
	}
}