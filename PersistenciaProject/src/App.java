
import dao.PessoaDAO;

public class App {
    public static void main(String[] args) throws Exception {


        PessoaDAO pessoaDAO = new PessoaDAO();

        pessoaDAO.delete(1111);

        // System.out.println(pessoas);
    }
}
