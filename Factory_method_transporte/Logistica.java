package Factory_method_transporte;

public class Logistica { // Classe de logística que usa o Factory Method
    public void planejarEntrega(String modo) {
        FabricaTransporte fabrica;
        if (modo.equalsIgnoreCase("caminhao")) {
            fabrica = new FabricaCaminhao();
        } else if (modo.equalsIgnoreCase("navio")) {
            fabrica = new FabricaNavio();
        } else if (modo.equalsIgnoreCase("trem")) {
            fabrica = new FabricaTrem();
        } else if (modo.equalsIgnoreCase("moto")) {
            fabrica = new FabricaMoto();
        } else {
            throw new IllegalArgumentException("Modo de transporte invalido");
        }

        Transporte transporte = fabrica.criarTransporte();
        transporte.entregar();
    }
}