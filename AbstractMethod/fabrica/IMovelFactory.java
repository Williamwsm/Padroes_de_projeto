package AbstractMethod.fabrica;

import AbstractMethod.movel.IMovel;

public interface IMovelFactory {
         IMovel createMovel(String tipo);
}
