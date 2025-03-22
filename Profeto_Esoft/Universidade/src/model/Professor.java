package model;

public class Professor extends Pessoa{
    protected String matricula;
    protected String especialidade;
    private double salario;

    public Professor(String nome, String cpf, int idade, String matricula, String especialidade, double salario) {
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Professor(String nome, String cpf, int idade, String genero, String matricula, String especialidade, double salario) {
        super(nome, cpf, idade, genero);
        this.matricula = matricula;
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void exibirDetalhes(){
        System.out.println("Professor "+ this.nome+" :");
        System.out.println("MAtricula: "+ this.matricula);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Especialidade: "+ this.especialidade);
    }
    
    public String getNome(){
        return nome;
    }

    public String getEspecialidade(){
        return especialidade;
    }

}
