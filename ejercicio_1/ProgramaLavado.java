package ejercicio_1;

public abstract class ProgramaLavado
{
    public void ejecutarPrograma() //Metodo plantilla
    {
        llenarAgua();
        agregarJabon();
        lavar();
        cambiarAgua();
        agregarEnjuague();
        enjuagar();
        centrifugar();
    }

    abstract void llenarAgua();
    abstract void lavar();
    abstract void enjuagar();
    abstract void centrifugar();

    //Como en todos es igual, no son abstract porque no requieren una reimplementacion
    void cambiarAgua()
    {
        System.out.println("Cambiando el agua...");
    }
    void agregarEnjuague()
    {
        System.out.println("Agregando enjuague...");
    }
    void agregarJabon()
    {
        System.out.println("Agregando jabon en polvo...");
    }
}