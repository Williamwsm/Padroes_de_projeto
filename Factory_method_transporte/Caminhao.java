package Factory_method_transporte;

public class Caminhao  implements Transporte{
    @Override
    public void entregar() {
        System.out.println("Entrega por caminhao");
    }
}
