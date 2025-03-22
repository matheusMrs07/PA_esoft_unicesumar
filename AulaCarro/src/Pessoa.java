import java.util.ArrayList;
import java.util.List;
import veiculos.Veiculo;

public class Pessoa{
    String nome;
    int idade;
    List<String> telefones = new ArrayList<>();
    Veiculo veiculo;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.telefones.add(telefone);
    }

    public Pessoa(String nome, int idade, String[] telefones){
        this.nome = nome;
        this.idade = idade;
        for(String tel: telefones){
            this.telefones.add(tel);
        }
    }

    public void inserrirTelefone(String telefone){
        this.telefones.add(telefone);
    }

    public void exibirTelefones(){
        for(String telefone: telefones){
            System.out.println("Tel: "+ telefone);
        }
    }

    public void comprarVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }

    // public void abastecerVeiculo(int veiculo, double valor){
    //     this.veiculos.get(veiculo).abastecer(valor);
    // }

    public void exibirVeiculos(){

        for(Veiculo veiculo : this.veiculos){
            veiculo.exebirInformacoes();
        }
    }

    public void exebirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }



}
