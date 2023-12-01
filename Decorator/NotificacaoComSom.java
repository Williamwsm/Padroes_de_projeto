package Padroes.Decorator;

public class NotificacaoComSom extends NoficacaoDecorator{
    public NotificacaoComSom(Notificacao notificacao) {
        super(notificacao);

    }

    @Override
    public String getMensagem() {
        return "Enviando notificação com som: "+ super.getMensagem();
    }
}
