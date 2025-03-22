package service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public void matricularAluno(Aluno a){
        alunos.add(a);
    }

    public void listarCursos(){
        cursos.values().stream().forEach(
            curso -> System.out.println(curso.getNome())
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

}
