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
    public Memento salvarEstado(){  // salva o conteudo em seu estado atual em um objeto memento
        return  new Memento(conteudo);
    }
    public  void restaurarEstado(Memento dadosSalvos){ // restaura o conteudo para a ultima versao
        // q foi salva dele no memento
        this.conteudo = dadosSalvos.getEstadoSalvo();
    }
}
