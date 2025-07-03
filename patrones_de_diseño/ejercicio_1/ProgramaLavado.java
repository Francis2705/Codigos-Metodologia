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

    protected abstract void llenarAgua();
    protected abstract void lavar();
    protected abstract void enjuagar();
    protected abstract void centrifugar();

    //Como en todos es igual, no son abstract porque no requieren una reimplementacion
    protected void cambiarAgua()
    {
        System.out.println("Cambiando el agua...");
    }
    protected void agregarEnjuague()
    {
        System.out.println("Agregando enjuague...");
    }
    protected void agregarJabon()
    {
        System.out.println("Agregando jabon en polvo...");
    }
}