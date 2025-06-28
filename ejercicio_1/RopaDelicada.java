package ejercicio_1;

public class RopaDelicada extends ProgramaLavado
{
    @Override
    void llenarAgua()
    {
        System.out.println("Llenando agua hasta el 100%...");
    }
    @Override
    void lavar()
    {
        System.out.println("Lavando ropa con agitación moderada por 40 minutos...");
    }
    @Override
    void enjuagar()
    {
        System.out.println("Enjuagando con agua limpia por 15 minutos...");
    }
    @Override
    void centrifugar()
    {
        System.out.println("No hay centrifugado...");
    }
}