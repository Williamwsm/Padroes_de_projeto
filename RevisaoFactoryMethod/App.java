package Padroes.RevisaoFactoryMethod;

import Padroes.RevisaoFactoryMethod.Logistica.Logistica;

public class App {
    public static void main(String[] args) {
        Logistica logistica = new Logistica();
        logistica.planejarProduto("ProdutoA");
        logistica.planejarProduto("ProdutoB");
        logistica.planejarProduto("ProdutoC");
    }
}
