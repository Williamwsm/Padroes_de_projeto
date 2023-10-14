package Padroes.AtvPrototype.UsuarioPrototype;

import Padroes.AtvPrototype.Usuario.Usuario;

public class ClientePrototype extends Usuario {
   private Usuario usuario = new Usuario();
    private String endereco;
    private double valorCompra;

    public ClientePrototype(Usuario usuario ,ClientePrototype cliente) {

        super(usuario.getNome(), usuario.getEmail(), usuario.getSenha());
        setEndereco("Rua: Campo novo");    }

    public ClientePrototype(){

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }


    public Usuario clone(Usuario usuario) {// passa o usuario como parametro para poder usar o super
        return new ClientePrototype (usuario,this);
    }


    public String informacao (Usuario usuario) {
        return ""+usuario.toString()+" ,endereco: '" + endereco + '\'' +
                ", valorCompra: " + valorCompra +
                ']'+" (Cliente)";
    }
}
