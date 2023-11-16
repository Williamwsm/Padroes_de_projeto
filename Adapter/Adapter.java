package Padroes.Adapter;

public class Adapter {
    public static void main(String[] args) {
        PessoaFisica pessoa  = new PessoaFisica(null);
        PessoaJuridica empresa = new PessoaJuridica("11.111.111/0001-11");
        PessoaProcesso pessoaProcesso = new PessoaProcesso();
        pessoaProcesso.processo(pessoa);
        pessoaProcesso.processo(empresa);



    }

}
