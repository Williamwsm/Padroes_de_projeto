package Padroes.AtvBuilder.Personagem;

public interface IPersonagemBuilder {
    IPersonagemBuilder contruirNome(String nome);

    IPersonagemBuilder contruirClasse(String classe);
    IPersonagemBuilder contruirNivel(int nivel);
    IPersonagemBuilder contruirArma(String arma);
    Personagem build();


}
