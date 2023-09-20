package Factory_method_transporte;

public class FabricaNavio implements FabricaTransporte{
    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }
}
