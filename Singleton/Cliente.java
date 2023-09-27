package Singleton;

public class Cliente {
    public static void main(String[] args) {
        LogSingleton log = LogSingleton.getInstancia("Remover");
        LogSingleton log2 = LogSingleton.getInstancia("Adicionar");

    }
}
