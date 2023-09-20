package Factory_method_transporte;

public class FabricaMoto implements FabricaTransporte{
    @Override
    public Transporte criarTransporte() {
        return new Moto();
    }
}
