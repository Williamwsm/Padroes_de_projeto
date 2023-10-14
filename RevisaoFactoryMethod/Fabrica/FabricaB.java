package Padroes.RevisaoFactoryMethod.Fabrica;

import Padroes.RevisaoFactoryMethod.Produto.IProduto;
import Padroes.RevisaoFactoryMethod.Produto.ProdutoB;

public class FabricaB implements IFabricaProduto{
    @Override
    public IProduto criarProduto() {
        return new ProdutoB();
    }
}
