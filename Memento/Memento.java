package Padroes.Memento;

public class Memento {

    private  String estadoSalvo;

    public String getEstadoSalvo() {
        return estadoSalvo;
    }

    public Memento(String estadoSalvo) {
        this.estadoSalvo = estadoSalvo;
    }
}
