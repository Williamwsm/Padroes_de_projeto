package Padroes.AtvPrototype.Teste;

import Padroes.AtvPrototype.Usuario.Usuario;
import Padroes.AtvPrototype.UsuarioPrototype.AdministradorPrototype;
import Padroes.AtvPrototype.UsuarioPrototype.ClientePrototype;
import Padroes.AtvPrototype.UsuarioPrototype.FuncionarioPrototype;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("vivi", "@gmail.com", "******");
        ClientePrototype cliente = new ClientePrototype();
        AdministradorPrototype adm = new AdministradorPrototype();
        FuncionarioPrototype funcionario = new FuncionarioPrototype();

        ClientePrototype novoCliente = (ClientePrototype) cliente.clone(usuario);
        novoCliente.setValorCompra(512);// alterando o valor da compra
        System.out.println(novoCliente.informacao(usuario));

        FuncionarioPrototype novoFuncionario = (FuncionarioPrototype) funcionario.clone(usuario);
        novoFuncionario.setCodFuncionario(4552); // alterando o codigo do usuario ja que o codigo do funcionario nao deve se repetir
        System.out.println(novoFuncionario.informacao(usuario));

        AdministradorPrototype novoAdm = (AdministradorPrototype) adm.clone(usuario);
        novoAdm.setCodAdm(7781);// alteracao feita pois nao deve se repetir o codigo de indentidicacao
        System.out.println(novoAdm.informacao(usuario));

    }
}
