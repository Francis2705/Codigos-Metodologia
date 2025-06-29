package ejercicio_4;

public class Mate extends BebidaCaliente {


    @Override
    protected void agregarProducto(){
        System.out.println("cebando la yerba en el mate....");
    }
    
    @Override
    protected void realizarUltimaAccion(){
        System.out.println("tomar con la bombilla");
    }
}
