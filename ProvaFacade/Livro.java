package Padroes.ProvaFacade;

public class Livro {
    private String titulo;
    private int numeroDePaginas;

    public Livro(String titulo, int numeroDePaginas) {
        this.titulo = titulo;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}
