package AbstractMethod.fabrica;

import AbstractMethod.cadeira.CadeiraVitoriana;
import AbstractMethod.mesa.MesaDeCentroVitoriana;
import AbstractMethod.movel.IMovel;
import FactoryMoveis.sofa.SofaVitoriano;

public class FabricaVitoriana  implements IMovelFactory {
    public IMovel createMovel(String tipo) {
        switch (tipo) {
            case "Cadeira":
                return new CadeiraVitoriana();
            case "Sofa":
                return new SofaVitoriano();
            case "MesaDeCentro":
                return new MesaDeCentroVitoriana();
            default:
                throw new IllegalArgumentException("Tipo de móvel desconhecido: " + tipo);
        }
    }
}
