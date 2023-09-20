package Factory_method_transporte;

public class App {
    public static void main(String[] args) {
        Logistica logistica = new Logistica();
        logistica.planejarEntrega("caminhao");
        logistica.planejarEntrega("navio");
        logistica.planejarEntrega("trem");
        logistica.planejarEntrega("moto");
    }
}
