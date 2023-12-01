package Padroes.Decorator;

public class Main {
    public static void main(String[] args) {
        Notificacao notificacao = new Notificacao("seu produto chegou ao destino") {
            @Override
            public String getMensagem() {
                return super.getMensagem();
            }

            @Override
            public void setMensagem(String mensagem) {
                super.setMensagem(mensagem);
            }
        };
        notificacao = new NotificacaoComSom(notificacao);
        notificacao = new NotificacaoComImagem(notificacao);
        notificacao = new NotificacaoComPrioridade(notificacao);
        notificacao = new NotificacaoComLog(notificacao);

        System.out.println(notificacao.getMensagem());

    }
}
