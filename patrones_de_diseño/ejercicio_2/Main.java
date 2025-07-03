package ejercicio_2;

public class Main
{
    public static void main(String[] args)
    {
        Cliente cliente = new Cliente("Sofía", "López", "sofia@mail.com", "1122334455");
        Pedido pedido = new Pedido(cliente, 2500);

        MedioPago medioDebito = new AdaptadorDebitoAutomatico();
        MedioPago medioDineroMail = new AdaptadorDineroMail();

        pedido.pagarCon(medioDebito); //Usa debito
        pedido.pagarCon(medioDineroMail); //Usa dineroMail
    }
}