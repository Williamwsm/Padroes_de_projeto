package Padroes.AtvPrototype.UsuarioPrototype;

import Padroes.AtvPrototype.Usuario.Usuario;

public class FuncionarioPrototype extends Usuario {
    private Usuario usuario = new Usuario();
    private int cargaHoraria;
    private int codFuncionario;
    private String setorFuncionario;

    public FuncionarioPrototype(Usuario usuario, FuncionarioPrototype funcionario){
        super(usuario.getNome(), usuario.getEmail(), usuario.getSenha());

        setCodFuncionario(4515);
        setSetorFuncionario("M");
        setCargaHoraria(8);
    }
    public  FuncionarioPrototype(){

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getSetorFuncionario() {
        return setorFuncionario;
    }

    public void setSetorFuncionario(String setorFuncionario) {
        this.setorFuncionario = setorFuncionario;
    }
    public Usuario clone(Usuario usuario){// passa o usuario como parametro para poder usar o super
       return new FuncionarioPrototype(usuario,this) ;

    }


    public String  informacao (Usuario usuario) {
        return  ""+usuario.toString()+  ", cargaHoraria: " + cargaHoraria +
                ", codFuncionario: " + codFuncionario +
                ", setorFuncionario: '" + setorFuncionario + '\'' +
                ']' +"(Funcionario)";
    }


}
