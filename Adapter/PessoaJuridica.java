package Padroes.Adapter;

public class PessoaJuridica implements IPessoaAdapter {
    private  String cnpj;

    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String getRegistro() {
        return cnpj;
    }
}
