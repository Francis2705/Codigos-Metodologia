package ejercicio_2;

public class DebitoAutomatico
{
    public boolean autorizar(String cbu, double monto)
    {
        System.out.println("Autorizando CBU: " + cbu + " por $" + monto);
        return true; //Se supone que siempre se autoriza
    }

    public void debitar(String cbu, double monto)
    {
        System.out.println("Debitando $" + monto + " del CBU: " + cbu);
    }
}