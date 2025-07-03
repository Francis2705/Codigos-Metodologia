package ejercicio_1;

public class RopaDelicada extends ProgramaLavado
{
    @Override
    protected void llenarAgua()
    {
        System.out.println("Llenando agua hasta el 100%...");
    }
    @Override
    protected void lavar()
    {
        System.out.println("Lavando ropa con agitación moderada por 40 minutos...");
    }
    @Override
    protected void enjuagar()
    {
        System.out.println("Enjuagando con agua limpia por 15 minutos...");
    }
    @Override
    protected void centrifugar()
    {
        System.out.println("No hay centrifugado...");
    }
}