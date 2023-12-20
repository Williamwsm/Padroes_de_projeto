package Padroes.ProvaFacade;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaFacade {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public  void addLivro(String titulo, int numeroDePaginas){
        Livro livro = new Livro(titulo, numeroDePaginas);
        livros.add(livro);
        System.out.println("Livro cadastrado");
    }

    public  void addUsuario(String nome, int cpf){
        Usuario usuario = new Usuario(nome, cpf);
        usuarios.add(usuario);
        System.out.println("Usuario cadastrado");
    }
    public  void realizarEmprestimo(String titulo, int cpf) throws  Exception{
        Livro livro = buscarLivro(titulo);
        Usuario usuario = buscarUsuaruio(cpf);
        Emprestimo emprestimo = new Emprestimo(usuario, livro);
        emprestimos.add(emprestimo);
        System.out.println("Emprestimo realizado");
    }

    public  Livro buscarLivro(String titulo) throws Exception{
        for (Livro l: livros) {
            if (l.getTitulo().equals(titulo)){
                return l;
            }
        }
        throw  new Exception(titulo+" Nao foi encontrado");
    }

    public Usuario buscarUsuaruio(int cpf)throws Exception{
        for (Usuario u: usuarios) {
            if (u.getCpf() == cpf){
                return u;
            }
        }
        throw  new Exception(cpf+" Nao foi encontrado");
    }

}
