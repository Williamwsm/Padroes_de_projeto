package Factory_method_transporte;

public class Navio implements  Transporte{
    @Override
    public void entregar() {
        System.out.println("Entrega por transporte maritimo");
    }
}
