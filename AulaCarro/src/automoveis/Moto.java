package automoveis;
import veiculos.Veiculo;

public class Moto extends Veiculo implements Combustivel{

    double qtd_combustivel = 0;

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar(){
        System.out.println("Girando o acelerador");
    }

    @Override
    public void abastecer(double qtd_abastecida){
        this.qtd_combustivel = this.qtd_combustivel + qtd_abastecida;
        System.out.println("Colocando Gasolina.");
    }

}
