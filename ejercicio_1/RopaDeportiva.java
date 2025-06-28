package ejercicio_1;

public class RopaDeportiva extends ProgramaLavado
{
    @Override
    void llenarAgua()
    {
        System.out.println("Llenando agua hasta el 100%...");
    }
    @Override
    void lavar() //Como solo esta clase tiene su lavado especifico, se codifica aca adentro
    {
        System.out.println("Lavando ropa con agitación moderada por 100 minutos...");
        System.out.println("Cambiando el agua...");
        System.out.println("Agregando jabon en polvo...");
        System.out.println("Lavando ropa con agitación moderada por 30 minutos...");
    }
    @Override
    void enjuagar()
    {
        System.out.println("Enjuagando con agua limpia por 15 minutos...");
    }
    @Override
    void centrifugar()
    {
        System.out.println("Centrifugando por 10 minutos...");
    }
}