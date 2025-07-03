package ejercicio_4;

public abstract class BebidaCaliente
{
    public void preparar()
    {
        this.calentarAgua();
        this.agregarProducto();
        this.agregarAgua();
        this.realizarUltimaAccion();
    }

    protected  void calentarAgua()
    {
        System.out.println("calentando agua....");
    }
    protected void agregarAgua()
    {
        System.out.println("agregando agua caliente");
    }
    protected abstract void agregarProducto();
    protected abstract void realizarUltimaAccion();
}
