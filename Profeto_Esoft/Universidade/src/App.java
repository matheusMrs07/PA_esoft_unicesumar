import java.util.Scanner;
import model.Aluno;
import model.Curso;
import model.Professor;
import service.GestorAcademico;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        GestorAcademico gestor = new GestorAcademico();

        
        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Listar Alunos");
            System.out.println("2. Listar Cursos");
            System.out.println("3. Listar Professores");
            System.out.println("4. Cadastrar Aluno");
            System.out.println("5. Cadastrar Curso");
            System.out.println("6. Cadastrar Professor");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    gestor.listarAlunos();
                    break;
                case 2:
                    gestor.listarCursos();
                    break;
                case 3:
                    gestor.listarProfessores();
                    break;
                case 4:
                    System.out.println("Cadastro de Aluno:");
                    System.out.println("Nome:");
                    String nome = scanner.nextLine();
                    System.out.println("CPF:");
                    String cpf = scanner.nextLine();
                    System.out.println("Idade:");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("RA:");
                    String ra = scanner.nextLine();
                    System.out.println("Código do curso: ");
                    String cod_curso = scanner.nextLine();

                    Aluno a = new Aluno(nome, cpf, idade, ra);
                    gestor.matricularAluno(a, cod_curso);
                    break;

                case 5:
                    System.out.println("Cadastro de Curso:");
                    System.out.println("Nome:");
                    String nomeCurso = scanner.nextLine();
                    System.out.println("Caraga Horária:");
                    int caragaH = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Código:");
                    String cod = scanner.nextLine();

                    Curso c = new Curso(nomeCurso, caragaH, cod);
                    gestor.cadastrarCurso(c);
                    break;
                case 6:
                    System.out.println("Cadastro de Professor:");
                    System.out.println("Nome:");
                    String nomeProf = scanner.nextLine();
                    System.out.println("CPF:");
                    String cpfProf = scanner.nextLine();
                    System.out.println("Idade:");
                    int idadeProf = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Matricula:");
                    String matricula = scanner.nextLine();
                    System.out.println("Especialidade: ");
                    String esp = scanner.nextLine();
                    System.out.println("Salario: ");
                    
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    Professor p = new Professor(nomeProf, cpfProf, idadeProf, matricula, esp, salario);
                    gestor.contratarProfessor(p);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    throw new AssertionError();
            }

        }
        
        // Curso c_esoft = new Curso("Engenharia de Soft", 100, "0001");
        // Curso c_adsis = new Curso("Analise de Sis", 60, "0002");
        // Curso c_Eng_civil = new Curso("Engenharia Civil", 160, "0003");
  

        // Professor p = new Professor("Jose pedro", "11111111",35,"987654", "Java", 1000.0);
        // Professor p1 = new Professor("Jose Da silva", "11111112",35,"987653", "C++", 1000.0);
        // Professor p2 = new Professor("Jonas Emanuel", "11111112",35,"987652", "Java", 1000.0);
        // Aluno a = new Aluno("João", "0000000", 20, "1234");



        // GestorAcademico gestor = new GestorAcademico();
        // gestor.contratarProfessor(p);
        // gestor.contratarProfessor(p1);
        // gestor.contratarProfessor(p2);
        // gestor.cadastrarCurso(c_esoft);
        // gestor.cadastrarCurso(c_adsis);
        // gestor.cadastrarCurso(c_Eng_civil);

        // gestor.matricularAluno(a, c_esoft);
        // Aluno a2 = new Aluno("Aluno 2", "0123456", 22,"123456");
        // gestor.matricularAluno(a2, c_adsis);

        // a.getCursosMatriculados().stream().forEach(curso -> System.out.println(curso.getNome()));

    }
}
