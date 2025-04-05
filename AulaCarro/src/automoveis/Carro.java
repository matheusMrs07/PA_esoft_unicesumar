package automoveis;
import custom.exeptions.TanqueCheioExeption;
import custom.exeptions.TanqueVazioException;
import veiculos.Veiculo;

public class Carro extends Veiculo implements Combustivel {

    private String placa;
    double qtd_combustivel = 0;
    double cap_tanque;
    public static final int velocidadeMaxima = 300;

    
    public Carro(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    public Carro(String marca, String modelo, int ano, double cap_tanque){
        super(marca, modelo, ano);
        this.cap_tanque = cap_tanque;
    }

    public Carro(String marca, String modelo, int ano, String placa, String cor, double cap_tanque){
        super(marca, modelo, ano, cor);
        this.placa = placa;
        this.cap_tanque = cap_tanque;
    }

    public void setPlaca(String placa, String motivo){
        if(this.placa == null){
            this.placa = placa;
        }
        else if(motivo == "troca de carro"){
            this.placa = placa;
        }else{
            System.out.println("A placa não pode ser alterada.");
        }
    }

    public String getPlaca(){
        return this.placa;
    }

    @Override
    public void acelerar() throws TanqueVazioException{
        if(qtd_combustivel < 1.0){
            throw new TanqueVazioException();
        }
        this.qtd_combustivel -= 1.00;
        System.out.println("Pisando no Acelerador");
    }

    @Override
    public void abastecer (double qtd_abastecida) throws TanqueCheioExeption{
        if((this.qtd_combustivel+qtd_abastecida) > this.cap_tanque){
            throw new TanqueCheioExeption();
        }
        this.qtd_combustivel = this.qtd_combustivel + qtd_abastecida;
        System.out.println("Colocando Gasolina");
    }

    @Override
    public void exebirInformacoes(){
        System.out.println("Marca: "+ this.marca);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ano: "+ this.ano);
        System.out.println("Combustível: "+ this.qtd_combustivel);

    }
}
