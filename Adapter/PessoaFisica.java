package Padroes.Adapter;

public class PessoaFisica implements  IPessoaAdapter{
    private  String cpf;

    public PessoaFisica(String cpf) {
        this.cpf = cpf;

    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String getRegistro() {
        return cpf;
    }
}
