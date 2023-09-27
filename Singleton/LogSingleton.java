package Singleton;

public class LogSingleton {
    private static LogSingleton instancia;
    public String operacao;

    private LogSingleton(String operacao){
        this.operacao = operacao;
    }
    public  static LogSingleton getInstancia(String operacao){
        if(instancia==null){
            instancia = new LogSingleton(operacao);
        }
        System.out.println(operacao);
        return instancia;
    }
}
