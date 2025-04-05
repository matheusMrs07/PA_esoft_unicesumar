package service;
import custom.exceptions.ItemNaoEncotradoException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import model.*;

public class GestorAcademico {
    List<Professor> professores = new ArrayList<>();
    List<Aluno> alunos = new ArrayList<>();
    Map<String, Curso> cursos = new HashMap<>();

    public void cadastrarCurso(Curso c){
        cursos.put(c.getCodigo(), c);
    }

    public void cadastrarCurso(String codigo, String nome, int cargaH){
        Curso c = new Curso(nome, cargaH, codigo);
        cursos.put(c.getCodigo(), c);
    }

    public void contratarProfessor(Professor p){
        professores.add(p);
    }

    public void demitirProfessor(Professor p){
        professores.remove(p);
    }

    public void matricularAluno(Aluno a, String curso_key) throws ItemNaoEncotradoException{
        Curso c = this.cursos.get(curso_key);
        if(c == null){
            System.out.println("Curso não encontrado!");
            return;
            // throw  new ItemNaoEncotradoException("Curso não encrontrado.");
        }
        a.matricalarEmCurso(c);
        alunos.add(a);
    }

    public void desmatricalarAluno(Aluno a, String curso_key){
        Curso c = this.cursos.get(curso_key);
        if(c == null){
            System.out.println("Curso com código "+curso_key+" não cadastrado|");
            return;
        }
        a.desmatricalarEmCurso(c);

        if(a.getCursosMatriculados().isEmpty()){
            this.alunos.remove(a);
        }
        
    }

    public void matricularAluno(Aluno a, Curso curso){
        Curso c = this.cursos.get(curso.getCodigo());
        if(c == null){
            System.out.println("Curso com código "+curso.getCodigo()+" não cadastrado|");
            return;
        }
        a.matricalarEmCurso(c);
        alunos.add(a);
    }

    public void desmatricalarAluno(Aluno a, Curso curso){
        Curso c = this.cursos.get(curso.getCodigo());
        if(c == null){
            System.out.println("Curso com código "+curso.getCodigo()+" não cadastrado|");
            return;
        }
        a.desmatricalarEmCurso(c);

        if(a.getCursosMatriculados().isEmpty()){
            this.alunos.remove(a);
        }
        
    }

    public void listarCursos(){
        cursos.values().stream().forEach(
            curso -> System.out.println(curso.getNome())
        );
    }

    public void listarAlunos(){
        this.alunos.stream().forEach(aluno -> aluno.exibirDetalhes());
    }

    public void listarProfessores(){
        professores.stream()
        .forEach(
            p -> p.exibirDetalhes()
        );
    }

    public void listarProfessoresPorNome(String filterName){
        professores.stream()
        .filter(p -> p.getNome().contains(filterName))
        .forEach(
            p -> System.out.println(p.getNome())
        );
    }

    public void listarProfessoresPorEsp(String filterEsp){
        professores.stream()
        .filter(p -> p.getEspecialidade().contains(filterEsp))
        .forEach(
            p -> System.out.println(p.getNome())
        );
    }
    
    public void listarProfessoresPorFiltro(Predicate<Professor> filtro) {
        professores.stream()
        .filter(filtro)
        .forEach(
            p -> System.out.println(p.getNome())
        );
    }

}
