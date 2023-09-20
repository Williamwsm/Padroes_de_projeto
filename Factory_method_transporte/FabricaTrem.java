package Factory_method_transporte;

public class FabricaTrem implements FabricaTransporte{
    @Override
    public Transporte criarTransporte() {
        return new Trem();
    }
}
