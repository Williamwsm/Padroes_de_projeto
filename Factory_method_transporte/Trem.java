package Factory_method_transporte;

public class Trem implements  Transporte{
    @Override
    public void entregar() {
        System.out.println("Entrega por transporte ferroviario");
    }
}
