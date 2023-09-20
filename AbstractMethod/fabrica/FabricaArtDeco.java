package AbstractMethod.fabrica;

import AbstractMethod.cadeira.CadeiraArtDeco;
import AbstractMethod.mesa.MesaDeCentroArtDeco;
import AbstractMethod.movel.IMovel;
import FactoryMoveis.sofa.SofaArtDeco;

public class FabricaArtDeco implements IMovelFactory {
    public IMovel createMovel(String tipo) {
        switch (tipo) {
            case "Cadeira":
                return new CadeiraArtDeco();
            case "Sofa":
                return new SofaArtDeco();
            case "MesaDeCentro":
                return new MesaDeCentroArtDeco();
            default:
                throw new IllegalArgumentException("Tipo de móvel desconhecido: " + tipo);
        }
    }
}