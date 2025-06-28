package ejercicio_1;

public class Main
{
    public static void main(String[] args)
    {
        LavadoDiario lavadoDiario = new LavadoDiario();
        lavadoDiario.ejecutarPrograma();
        System.out.println("-------------------------");
        RopaDelicada ropaDelicada = new RopaDelicada();
        ropaDelicada.ejecutarPrograma();
        System.out.println("-------------------------");
        RopaDeportiva ropaDeportiva = new RopaDeportiva();
        ropaDeportiva.ejecutarPrograma();
    }
}