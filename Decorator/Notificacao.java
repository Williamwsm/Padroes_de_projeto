package Padroes.Decorator;

public abstract class Notificacao {
    public Notificacao(String mensagem) {
        this.mensagem = mensagem;
    }

    private String mensagem;



    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
