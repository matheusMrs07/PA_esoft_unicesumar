package dao;

import java.sql.Connection;

import factory.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.Pessoa;

public class PessoaDAO {

    public void create(Pessoa pessoa){
        String sql = "INSERT INTO pessoas(nome, idade, cpf) values(?,?,?)";

        
        try (
            Connection conn = ConnectionFactory.getConnectionMySQL();
            PreparedStatement stmt = conn.prepareStatement(sql)
            
        ){

            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getIdade());
            stmt.setString(3, pessoa.getCpf());

            stmt.execute();

            System.out.println("Pessoa inserida com sucesso!");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Pessoa> read(){
        String sql = "SELECT * FROM pessoas";

        List<Pessoa> pessoas = new ArrayList<>();
        
        try (
            Connection conn = ConnectionFactory.getConnectionMySQL();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ){
            System.out.println("Lista de Pessoas");
            
            while(rs.next()){
                System.out.println("ID: "+ rs.getInt("id"));
                System.out.println("Nome: "+rs.getString("nome"));
                System.out.println("Idade: "+rs.getInt("idade"));
                System.out.println("CPF: "+rs.getString("cpf"));
                System.out.println("----------------------------------------");

                Pessoa p = new Pessoa(
                    rs.getString("nome"), 
                    rs.getInt("idade"), 
                    rs.getString("cpf")
                    );
    
                p.setId(rs.getInt("id"));

                pessoas.add(p);
            }

           

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pessoas;

    }

    public void update(Pessoa pessoa){

        String sql = "UPDATE pessoas SET nome=?, idade=?, cpf=? WHERE id = ?";

        try(
            Connection conn = ConnectionFactory.getConnectionMySQL();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ){

            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getIdade());
            stmt.setString(3, pessoa.getCpf());
            stmt.setInt(4, pessoa.getId());

            int linhas_aff = stmt.executeUpdate();

            if(linhas_aff == 0){
                System.out.println("Error: Pessoa com ID: "+pessoa.getId()+" não encontrada!");
            }else{
                System.out.println("Pessoa Edidata com sucesso!");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public void delete(int id){
        String sql = "DELETE FROM pessoas WHERE id = ?";

        try (
            Connection conn = ConnectionFactory.getConnectionMySQL();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ){

            stmt.setInt(1, id);
            int linhas_aff = stmt.executeUpdate();

            if(linhas_aff > 0 ){
                System.out.println("Pessoa deletada com sucesso!");
            }else{
                System.out.println("Error: Pessoa com ID: "+id+" não encontrada!");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void read(String nome, int idade){
        String sql = "SELECT * FROM pessoas WHERE nome=?";

    }

}
