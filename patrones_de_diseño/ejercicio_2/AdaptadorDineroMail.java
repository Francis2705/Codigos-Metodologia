package ejercicio_2;

public class AdaptadorDineroMail implements MedioPago
{
    private DineroMail dineroMail = new DineroMail();

    @Override
    public void pagar(Cliente cliente, double monto)
    {
        dineroMail.enviarPago(cliente.getEmail(), monto);
    }
}