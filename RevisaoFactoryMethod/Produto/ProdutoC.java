package Padroes.RevisaoFactoryMethod.Produto;

public class ProdutoC implements IProduto{
    @Override
    public void criar() {
        System.out.println("Criando o produto C");
    }
}
