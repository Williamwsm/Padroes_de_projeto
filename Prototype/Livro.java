package Padroes.Prototype;

public class Livro extends  LivroPrototype {
    public Livro(Livro livro){ // ou cria 2 objetos do tipo livro e usa um como parametro para esse construtor ou usa 1 objeto do tipo livro e deixa como parametro pro clonar
        setAutor("Filho de fumaca");
        setAssunto("A historia de como consegui meus estagios");
        setCategotia("drama");
        setTitulo("Do lixo ao luxo, uma historia real");
    }
    public Livro(){
// cria o objeto q vai ser passado por parametro para q possa ser clonado
    }

    @Override
    public String exibirInfo() {
        return "\nTITULO: "+getTitulo()+
                "\nAUTOR: "+getAutor()+
                "\nCATEGORIA: "+ getCategotia()+
                "\nASSUNTO: "+ getAssunto()+"\n\n";
    }

    @Override
    public LivroPrototype clonar() { // vai retornar o mesmo livro para outros, mas passando por parametro o primeiro livro criado os outros livros vao ser do tipo LivroPrototype
        return  new Livro(this);
    }
}
