package Padroes.Poxy;

public class ArquivoPoxy extends Arquivo{
    protected String usuario;
    protected String senha;

    public ArquivoPoxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public void criar() {
        if (temPermissao(senha, usuario)) {
            super.criar();
        }else {
            System.out.println("Usuario invalido");
        }
    }

    @Override
    public void ler() {
        if (temPermissao(senha, usuario)) {
            super.ler();
        }else {
            System.out.println("Usuario invalido");
        }
    }

    @Override
    public void atualizar() {
        if (temPermissao(senha, usuario)) {
            super.atualizar();
        }else {
            System.out.println("Usuario invalido");
        }
    }

    @Override
    public void excluir() {
        if (temPermissao(senha, usuario)) {
            super.excluir();
        }else {
            System.out.println("Usuario invalido");
        }
    }

    public  boolean temPermissao(String senha, String usuario){
       return usuario.equals("adm")&& senha.equals("01234567");
    }
}
