package ejercicio_2;

public class Pedido
{
    private Cliente cliente;
    private double monto;

    public Pedido(Cliente cliente, double monto)
    {
        this.cliente = cliente;
        this.monto = monto;
    }

    public void pagarCon(MedioPago medio)
    {
        medio.pagar(cliente, monto);
    }
}