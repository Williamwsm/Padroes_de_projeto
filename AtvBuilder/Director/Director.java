package Padroes.AtvBuilder.Director;


import Padroes.AtvBuilder.Personagem.IPersonagemBuilder;
import Padroes.AtvBuilder.Personagem.Personagem;

public class Director {
    public Director(){

    }

    public Personagem construirPersonagem(IPersonagemBuilder builder){
       return builder.build();
    }
}
