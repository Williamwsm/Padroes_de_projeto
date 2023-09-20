package Factory_method_transporte;

public class FabricaCaminhao  implements FabricaTransporte{
    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}
