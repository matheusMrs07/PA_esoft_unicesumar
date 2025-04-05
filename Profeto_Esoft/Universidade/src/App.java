import custom.exceptions.ItemNaoEncotradoException;
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
            try{
                switch (opcao) {
                    case 1:
                        System.out.println("Lista de Alunos: ");
                        gestor.listarAlunos();
                        break;
                    case 2:
                        System.out.println("Lista de Cursos: ");
                        gestor.listarCursos();
                        break;
                    case 3:
                        System.out.println("Lista de Professores:");
                        gestor.listarProfessores();
                        break;
                    case 4:
                        System.out.println("Cadastro de Aluno:");
                        System.out.print("Nome:");
                        String nome = scanner.nextLine();
                        System.out.print("CPF:");
                        String cpf = scanner.nextLine();
                        System.out.print("Idade:");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("RA:");
                        String ra = scanner.nextLine();
                        System.out.print("Código do curso: ");
                        String cod_curso = scanner.nextLine();

                        Aluno a = new Aluno(nome, cpf, idade, ra);
                        
                        gestor.matricularAluno(a, cod_curso);                        
                        break;

                    case 5:
                        System.out.println("Cadastro de Curso:");
                        System.out.print("Nome:");
                        String nomeCurso = scanner.nextLine();
                        System.out.print("Caraga Horária:");
                        int caragaH = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Código:");
                        String cod = scanner.nextLine();

                        Curso c = new Curso(nomeCurso, caragaH, cod);
                        gestor.cadastrarCurso(c);
                        break;
                    case 6:
                        System.out.println("Cadastro de Professor:");
                        System.out.print("Nome:");
                        String nomeProf = scanner.nextLine();
                        System.out.print("CPF:");
                        String cpfProf = scanner.nextLine();
                        System.out.print("Idade:");
                        int idadeProf = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Matricula:");
                        String matricula = scanner.nextLine();
                        System.out.print("Especialidade: ");
                        String esp = scanner.nextLine();
                        System.out.print("Salario: ");
                        
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

            }catch(ItemNaoEncotradoException e){
                System.out.println(e.getMessage());
            }

        }

    }
}
