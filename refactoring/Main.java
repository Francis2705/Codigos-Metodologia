import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // Crear habilidades
        TipoHabilidad magica = new HabilidadMagica();
        TipoHabilidad cuerpoACuerpo = new HabilidadCuerpoACuerpo();

        // Crear personajes
        Personaje mago = new Personaje("Gandalf", 50, magica);
        Personaje guerrero = new Personaje("Aragorn", 60, cuerpoACuerpo);

        // Crear lista de personajes
        List<Personaje> lista = new ArrayList<>();
        lista.add(mago);
        lista.add(guerrero);

        // Crear videojuego
        Videojuego juego = new Videojuego();
        juego.setNombre("Batalla Épica");
        juego.setPersonajes(lista);

        // Encontrar y mostrar personaje con más daño
        Personaje masFuerte = juego.personajeConMasDaño();
        System.out.println("Personaje con más daño:");
        juego.imprimirInfo(masFuerte);
    }
}
