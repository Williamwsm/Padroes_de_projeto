package Padroes.Decorator;

public abstract  class NoficacaoDecorator extends Notificacao {
   private  Notificacao notificacao;



    public NoficacaoDecorator(Notificacao notificacao) {
        super(" ");
        this.notificacao = notificacao;
    }


    @Override
    public String getMensagem() {
        return notificacao.getMensagem();
    }

    @Override
    public void setMensagem(String mensagem) {
        notificacao.setMensagem(mensagem);
    }
}
