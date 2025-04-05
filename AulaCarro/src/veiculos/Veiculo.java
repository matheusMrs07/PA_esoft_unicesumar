package veiculos;

import custom.exeptions.TanqueVazioException;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    String cor;

    public Veiculo(String marca, String modelo, int ano){
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Veiculo(String marca, String modelo, int ano, String cor){
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public abstract void acelerar() throws TanqueVazioException;

    public void exebirInformacoes(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano: "+ ano);
        System.out.println("Cor: "+ cor);
    }
}
