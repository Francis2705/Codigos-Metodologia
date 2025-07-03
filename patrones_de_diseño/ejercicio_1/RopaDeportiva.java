package ejercicio_1;

public class RopaDeportiva extends ProgramaLavado
{
    @Override
    protected void llenarAgua()
    {
        System.out.println("Llenando agua hasta el 100%...");
    }
    @Override
    protected void lavar() //Como solo esta clase tiene su lavado particular, se especifica aca adentro
    {
        System.out.println("Lavando ropa con agitación moderada por 100 minutos...");
        this.cambiarAgua();
        this.agregarJabon();
        System.out.println("Lavando ropa con agitación moderada por 30 minutos...");
    }
    @Override
    protected void enjuagar()
    {
        System.out.println("Enjuagando con agua limpia por 15 minutos...");
    }
    @Override
    protected void centrifugar()
    {
        System.out.println("Centrifugando por 10 minutos...");
    }
}