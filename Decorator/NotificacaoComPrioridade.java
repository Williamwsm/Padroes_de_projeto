package Padroes.Decorator;

public class NotificacaoComPrioridade extends NoficacaoDecorator{


    public NotificacaoComPrioridade(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String getMensagem() {
        return "Enviando notificação com prioridade: "+ super.getMensagem();
    }
}
