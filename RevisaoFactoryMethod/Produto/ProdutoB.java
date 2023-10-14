package Padroes.RevisaoFactoryMethod.Produto;

import Padroes.RevisaoFactoryMethod.Produto.IProduto;

public class ProdutoB implements IProduto {

    @Override
    public void criar() {
        System.out.println("criando o produto B");
    }
}
