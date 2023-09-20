package AbstractMethod.fabrica;

import AbstractMethod.cadeira.CadeiraModerna;
import AbstractMethod.mesa.MesaDeCentroModerna;
import AbstractMethod.movel.IMovel;
import FactoryMoveis.sofa.SofaModerno;

public class FabricaModerna implements IMovelFactory {
    public IMovel createMovel(String tipo){
        switch (tipo) {
            case "Cadeira":
                return new CadeiraModerna();
            case "Sofa":
                return new SofaModerno();
            case "MesaDeCentro":
                return new MesaDeCentroModerna();
            default:
                throw new IllegalArgumentException("Tipo de móvel desconhecido: " + tipo);
        }
    }
}
