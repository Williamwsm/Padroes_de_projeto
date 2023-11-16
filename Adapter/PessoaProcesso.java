package Padroes.Adapter;

import java.util.Objects;

public class PessoaProcesso {
    public  void processo(IPessoaAdapter adapter){
        if (Objects.isNull(adapter.getRegistro())){ // verifica se o objeto esta nulo
            System.out.println("Registo invalido");
        }

    }
}
