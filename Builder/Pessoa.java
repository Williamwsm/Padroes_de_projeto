package Padroes.Builder;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String usuario;
    private String email;

    private Pessoa(String nome, String sobrenome, String usuario, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.usuario = usuario;
        this.email = email;
    }



    @Override
    public String toString() {
        return "[" +
                "nome: '" + nome + '\'' +
                ", sobrenome: '" + sobrenome + '\'' +
                ", usuario: '" + usuario + '\'' +
                ", email: '" + email + '\'' +
                ']';
    }
    public  static  class PessoaBuilder{
        private String nome;
        private String sobrenome;
        private String usuario;
        private String email;

        public PessoaBuilder nome(String nome){ // pega e retorna o objeto
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome){
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder usuario(String usuario){
            this.usuario = usuario;
            return this;
        }

        public PessoaBuilder email(String email){
            this.email = email;
            return this;
        }

        public Pessoa build(){ // cria um objeto e passa os atributo pro construtor  podendo chamar o metodo msm que ele nao tenha todos os atributos
            return new Pessoa(nome,sobrenome,usuario,email);
        }
    }



    


}
