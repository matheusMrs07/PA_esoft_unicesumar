package custom.exeptions;

public class TanqueCheioExeption extends Exception{

    public int valorExedido; 
    public TanqueCheioExeption(String message, int valorExedido){
        super(message);
        this.valorExedido = valorExedido;
    }

    public TanqueCheioExeption(){
        super("Quantidade Abastecida não cabe no Tanque");
    }

}
