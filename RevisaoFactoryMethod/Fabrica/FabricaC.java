package Padroes.RevisaoFactoryMethod.Fabrica;

import Padroes.RevisaoFactoryMethod.Produto.IProduto;
import Padroes.RevisaoFactoryMethod.Produto.ProdutoC;

public class FabricaC implements IFabricaProduto{
    @Override
    public IProduto criarProduto() {
        return new ProdutoC();
    }
}
