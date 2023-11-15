package Padroes.Poxy;

public class Main {
    public static void main(String[] args) {
        Arquivo adm  = new ArquivoPoxy("adm", "01234567");
        adm.criar();
        adm.atualizar();
        adm.ler();
        adm.excluir();

    }
}
