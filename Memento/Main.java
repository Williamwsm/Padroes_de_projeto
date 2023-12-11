package Padroes.Memento;

public class Main {

    public static void main(String[] args) {
        EditorDeTexto editor = new EditorDeTexto();
        Caretaker caretaker = new Caretaker();

        editor.digitar("Lista de compras de fim de ano:");
        caretaker.adicionarEstado(editor.salvarEstado());
        editor.digitar("Monitor, teclado");
        caretaker.adicionarEstado(editor.salvarEstado());
        System.out.println("Conteúdo atual: " + editor.getConteudo());

        editor.restaurarEstado(caretaker.getEstados(0));
        System.out.println("Conteúdo após restaurar: " + editor.getConteudo());
    }
}
