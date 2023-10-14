package Padroes.AtvPrototype.UsuarioPrototype;

import Padroes.AtvPrototype.Usuario.Usuario;

public class AdministradorPrototype extends Usuario {
    private Usuario usuario = new Usuario();
    private int codAdm;
    private String equipeAdm;
    private  String setorAdm;

    public AdministradorPrototype(Usuario usuario,AdministradorPrototype adm) {
        super(usuario.getNome(), usuario.getEmail(), usuario.getSenha());
        setCodAdm(451);
       setEquipeAdm("A");
       setSetorAdm("loja");
    }
    public AdministradorPrototype(){

    }

    public int getCodAdm() {
        return codAdm;
    }

    public void setCodAdm(int codAdm) {
        this.codAdm = codAdm;
    }

    public String getEquipeAdm() {
        return equipeAdm;
    }

    public void setEquipeAdm(String equipeAdm) {
        this.equipeAdm = equipeAdm;
    }

    public String getSetorAdm() {
        return setorAdm;
    }

    public void setSetorAdm(String setorAdm) {
        this.setorAdm = setorAdm;
    }


    public Usuario clone(Usuario usuario) {
        return new AdministradorPrototype(usuario,this);
    } // passa o usuario como parametro para poder usar o super


    public String informacao (Usuario usuario) {
        return ""+usuario.toString()+
                " ,equipeAdm: '" + equipeAdm + '\'' +
                " ,codAdm: '" + codAdm + '\'' +
                ", setorAdm: '" + setorAdm + '\'' +
                ']'+"(Administrsdor)";
    }

}
