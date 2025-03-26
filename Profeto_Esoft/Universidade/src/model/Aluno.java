package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    protected String ra;
    protected List<Curso> cursos = new ArrayList<>();

    public Aluno(String nome, String cpf, int idade, String ra) {
        super(nome, cpf, idade);
        this.ra = ra;
    }

    public Aluno(String nome, String cpf, int idade, String genero, String ra) {
        super(nome, cpf, idade, genero);
        this.ra = ra;
    }

    public Aluno(String nome, String cpf, int idade, String ra, Curso c) {
        super(nome, cpf, idade);
        this.ra = ra;
        this.cursos.add(c);
    }

    public Aluno(String nome, String cpf, int idade, String genero, String ra, Curso c) {
        super(nome, cpf, idade, genero);
        this.ra = ra;
        this.cursos.add(c);
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.println("Aluno "+ this.nome+" :");
        System.out.println("RA: "+ this.ra);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Curso: "+ this.cursos);
    }

    public void matricalarEmCurso(Curso c){
        this.cursos.add(c);
    }

    public void desmatricalarEmCurso(Curso c){
        this.cursos.remove(c);
    }

    public List<Curso> getCursosMatriculados(){
        return this.cursos;
    }
    

}
