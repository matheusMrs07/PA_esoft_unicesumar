
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/esoft";
        String user = "root";
        String password = "root";
        
        String sql = "INSERT INTO pessoas (nome, idade, cpf) values (?, ?, ?)";

        Pessoa p = new Pessoa("Maria", 25, "000000001");

        try(Connection conn = DriverManager.getConnection(url, user, password);){

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getIdade());
            stmt.setString(3, p.getCpf());

            stmt.execute();

            System.out.println("Salvo com sucesso!");

        } catch(SQLException e){
            e.printStackTrace();
        }

        
        

    }
}
