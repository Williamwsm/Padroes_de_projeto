package Padroes.Memento;

public class EditorDeTexto {
       private String conteudo;

    public String getConteudo() {
        return conteudo;
    }

    public EditorDeTexto() {
        this.conteudo = "";

    }
    public  void digitar(String texto){
        this.conteudo += " "+ texto;

    }
    public Memento salvarEstado(){
        return  new Memento(conteudo);
    }
    public  void restaurarEstado(Memento dadosSalvos){
        this.conteudo = dadosSalvos.getEstadoSalvo();
    }
}
