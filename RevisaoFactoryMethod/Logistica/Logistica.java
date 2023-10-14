package Padroes.RevisaoFactoryMethod.Logistica;

import Padroes.RevisaoFactoryMethod.Fabrica.FabricaA;
import Padroes.RevisaoFactoryMethod.Fabrica.FabricaB;
import Padroes.RevisaoFactoryMethod.Fabrica.FabricaC;
import Padroes.RevisaoFactoryMethod.Fabrica.IFabricaProduto;
import Padroes.RevisaoFactoryMethod.Produto.IProduto;

public class Logistica {
    public  void planejarProduto(String tipoProduto){
        IFabricaProduto fabrica; // objeto  do tipo IFabricaProduto
        if (tipoProduto.equalsIgnoreCase("ProdutoA")){// compara se o produto existe
            fabrica = new FabricaA(); // fabrica vira uma fabricaA para poder criar o produtoA
        }else if (tipoProduto.equalsIgnoreCase("ProdutoB")){
            fabrica= new FabricaB();
        }else if (tipoProduto.equalsIgnoreCase("ProdutoC")){
            fabrica= new FabricaC();
        }else {
            throw new IllegalStateException("produto nao encontrado");
        }

        IProduto produto = fabrica.criarProduto(); // produto criado na fabrica
        produto.criar();// passa a mensagem do produto

    }
}
