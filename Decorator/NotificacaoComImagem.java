package Padroes.Decorator;

public class NotificacaoComImagem  extends NoficacaoDecorator{


    public NotificacaoComImagem(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String getMensagem() {
        return "Enviando notificação com imagem: " + super.getMensagem();
    }
}
