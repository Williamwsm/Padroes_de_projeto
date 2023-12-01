package Padroes.Decorator;

public class NotificacaoComLog extends NoficacaoDecorator{
    public NotificacaoComLog(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String getMensagem() {
        return "Enviando notificação  com Log: " + super.getMensagem();
    }

}
