package Padroes.RevisaoFactoryMethod.Fabrica;

import Padroes.RevisaoFactoryMethod.Produto.IProduto;
import Padroes.RevisaoFactoryMethod.Produto.ProdutoA;

public class FabricaA implements IFabricaProduto { // implementacao das fabricas
    @Override
    public IProduto criarProduto() {
        return new ProdutoA(); //criacacao do produto A do tipo IProduto
    }
}
