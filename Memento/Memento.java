package Padroes.Memento;

public class Memento {

    private  String estadoSalvo;

    public String getEstadoSalvo() {
        return estadoSalvo;
    }

    public Memento(String estadoSalvo) { // armazena o conteudo q  estar sendo salvado
        this.estadoSalvo = estadoSalvo;
    }
}
