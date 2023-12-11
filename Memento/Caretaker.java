package Padroes.Memento;
import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> backup = new ArrayList<>();

    public void adicionarEstado(Memento estado) {
        backup.add(estado);
    }

    public Memento getUltimoEstadoSalvo() {
        if (backup.isEmpty()) {
            return null;
        }
        return backup.get(backup.size() - 1);
    }

    public Memento getEstados(int indice) { // encontra o indice do estado salvo
        if (indice >= 0 && indice < backup.size()) {
            return backup.get(indice);
        }
        return null;
    }


}
