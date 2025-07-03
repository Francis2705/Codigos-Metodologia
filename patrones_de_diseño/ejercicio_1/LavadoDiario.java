package ejercicio_1;

public class LavadoDiario extends ProgramaLavado
{
    @Override
    protected void llenarAgua()
    {
        System.out.println("Llenando agua hasta el 50%...");
    }
    @Override
    protected void lavar()
    {
        System.out.println("Lavando ropa con agitación moderada por 20 minutos...");
    }
    @Override
    protected void enjuagar()
    {
        System.out.println("Enjuagando por 7 minutos de enjuague con agua limpia...");
    }
    @Override
    protected void centrifugar()
    {
        System.out.println("Centrifugando por 3 minutos...");
    }
}