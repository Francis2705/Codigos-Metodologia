package ejercicio_2;

public class AdaptadorDebitoAutomatico implements MedioPago
{
    private DebitoAutomatico debito = new DebitoAutomatico();

    @Override
    public void pagar(Cliente cliente, double monto)
    {
        if (debito.autorizar(cliente.getCbu(), monto)) 
        {
            debito.debitar(cliente.getCbu(), monto);
            System.out.println("Monto autorizado debitado.");
        }
        else
        {
            System.out.println("No se pudo autorizar el débito.");
        }
    }
}