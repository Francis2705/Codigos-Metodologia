package ejercicio_4;


public class Main {
    public static void main(String[] args)
    {
        Mate mate = new Mate();
        Cafe cafe = new Cafe();

        System.out.println("--------------- CAFE -------------------");

        cafe.preparar();

        System.out.println("--------------- MATE -------------------");

        mate.preparar();

        
    }
}