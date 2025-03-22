import model.Aluno;
import model.Curso;
import model.Professor;
import service.GestorAcademico;

public class App {
    public static void main(String[] args) throws Exception {
        Curso c = new Curso("JAVA", 60, "0001");

        Aluno a = new Aluno("João", "0000000", 20, "1234");
        a.matricalarEmCurso(c);

        Professor p = new Professor("Jose pedro", "11111111",35,"987654", "Java", 1000.0);
        Professor p1 = new Professor("Jose Da silva", "11111112",35,"987653", "C++", 1000.0);
        Professor p2 = new Professor("Jonas emanue", "11111112",35,"987652", "Java", 1000.0);

        GestorAcademico gestor = new GestorAcademico();
        gestor.contratarProfessor(p);
        gestor.contratarProfessor(p1);
        gestor.contratarProfessor(p2);

        gestor.listarProfessoresPorNome("Jose");
    }
}
