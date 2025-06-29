package ejercicio_1;

public class RopaDelicada extends ProgramaLavado
{
    @Override
    public void llenarAgua()
    {
        System.out.println("Llenando agua hasta el 100%...");
    }
    @Override
    public void lavar()
    {
        System.out.println("Lavando ropa con agitación moderada por 40 minutos...");
    }
    @Override
    public void enjuagar()
    {
        System.out.println("Enjuagando con agua limpia por 15 minutos...");
    }
    @Override
    public void centrifugar()
    {
        System.out.println("No hay centrifugado...");
    }
}