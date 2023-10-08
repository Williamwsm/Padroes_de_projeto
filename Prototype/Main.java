package Padroes.Prototype;


public class Main {
    public static void main(String[] args) {
        Livro drama = new Livro(); //  se criar outro objeto do tipo livro  e passar esse primeiro como parametro, daria certo tbm 
                                    // assim quando fosse ver as informacoes do objeto, nao estariam nulas ao contrario dessa forma apresentada
        LivroPrototype livros = drama.clonar();
        livros.setDedicatoria("PARA CAMILE");

        LivroPrototype livro = drama.clonar();
        livro.setDedicatoria("PARA UILMA");

        System.out.println( livros.exibirInfo() + livros.getDedicatoria());
        System.out.println(livro.exibirInfo()+ livro.getDedicatoria());

    }
}
