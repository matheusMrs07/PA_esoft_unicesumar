import veiculos.Veiculo;

public class Bicicleta extends Veiculo {


    public Bicicleta(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar(){
        System.out.println("Pedalando.");
    }

}
