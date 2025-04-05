package custom.exceptions;

public class ItemNaoEncotradoException extends Exception{
    public ItemNaoEncotradoException(){
        super("Erro: Valor não encontrado");
    }

    public ItemNaoEncotradoException(String message){
        super(message);
    }
}
