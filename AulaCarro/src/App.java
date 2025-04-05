import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        try (FileWriter escritor = new FileWriter("./arquivo.txt", true)){
            escritor.write("Usuario: Maria \n");
            System.out.println("Salvo com sucesso!");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
    }
}
