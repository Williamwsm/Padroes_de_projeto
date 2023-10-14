package Padroes.AtvBuilder.Personagem;

public class PersonagemBuilderImpl implements IPersonagemBuilder {
    private String nome;
    private String classe;
    private int nivel;
    private String arma;

    @Override
    public IPersonagemBuilder contruirNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public IPersonagemBuilder contruirClasse(String classe) {
        this.classe = classe;
        return this;
    }

    @Override
    public IPersonagemBuilder contruirNivel(int nivel) {
        this.nivel = nivel;
        return this;
    }

    @Override
    public IPersonagemBuilder contruirArma(String arma) {
        this.arma = arma;
        return this;
    }

    public Personagem build(){
        return new Personagem(nome, classe, nivel, arma);
    }

}
