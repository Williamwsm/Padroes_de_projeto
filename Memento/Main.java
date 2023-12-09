package Padroes.Memento;

public class Main {

    public static void main(String[] args) {
        EditorDeTexto editor = new EditorDeTexto();
        editor.digitar("promocoes de fim de ano");
        editor.digitar("para atualizar o setup:");

        Memento momento1 = editor.salvarEstado();
        System.out.println("Conteúdo atual:" + editor.getConteudo());
        editor.digitar("aniversario da Terabyte");
        System.out.println("Conteúdo atual:" + editor.getConteudo());
        editor.restaurarEstado(momento1);
        System.out.println("Conteúdo após desfazer:" + editor.getConteudo());
        }
}
