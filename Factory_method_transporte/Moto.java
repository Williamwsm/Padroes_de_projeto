package Factory_method_transporte;

public class Moto implements Transporte{
    @Override
    public void entregar() {
        System.out.println("Entrega por moto");
    }
}
