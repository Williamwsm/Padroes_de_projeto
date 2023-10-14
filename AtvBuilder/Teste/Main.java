package Padroes.AtvBuilder.Teste;

import Padroes.AtvBuilder.Director.Director;
import Padroes.AtvBuilder.Personagem.IPersonagemBuilder;
import Padroes.AtvBuilder.Personagem.Personagem;
import Padroes.AtvBuilder.Personagem.PersonagemBuilderImpl;

public class Main {
    public static void main(String[] args) {
        IPersonagemBuilder builder = new PersonagemBuilderImpl();
        Director director = new Director();

         builder.contruirNome("WIll")
                .contruirClasse("Mago").contruirNivel(15).contruirArma("cajado");

         Personagem personagem = director.construirPersonagem(builder);

        System.out.println(personagem); // nao conseguir usar o director

    }
}

