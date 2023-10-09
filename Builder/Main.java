package Padroes.Builder;

public class Main {
    public static void main(String[] args) {
       Pessoa pessoa = new Pessoa.PessoaBuilder().nome("William")
                .email("usuario@gmail.com")
                .usuario("WilliamWSM")
                .sobrenome("Santos")
                .build();
        System.out.println(pessoa);
    }
}
