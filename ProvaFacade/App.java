package Padroes.ProvaFacade;

public class App {
    public static void main(String[] args) throws Exception {
        // criando fachada
        BibliotecaFacade biblioteca = new BibliotecaFacade();
        biblioteca.addLivro("Como virar uma padeira", 452); // adicionando livro
        biblioteca.addUsuario("kaylaine",00000000000); // adicionando usuario
        try {
            biblioteca.realizarEmprestimo("Como virar uma padeira", 545124121); // fazendo emprestimo
        }catch (Exception e){
            System.out.println("\n Nao foi possivel realizar o emprestimo, pois "+e.getMessage()); // tratando excecao
        }
    }
}
