package Padroes.RevisaoFactoryMethod.Produto;

import Padroes.RevisaoFactoryMethod.Produto.IProduto;

public class ProdutoA implements IProduto { // quando o produto for criado sera mostrado mensagem
    @Override
    public void criar() {
        System.out.println("criando produto A");
    }
}
