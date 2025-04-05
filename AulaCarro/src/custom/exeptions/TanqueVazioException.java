package custom.exeptions;

public class TanqueVazioException extends Exception{
    public TanqueVazioException(String message){
        super(message);
    }

    public TanqueVazioException(){
        super("Erro: Sem combustível!!!");
    }
}
