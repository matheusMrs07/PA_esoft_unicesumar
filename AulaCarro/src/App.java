import automoveis.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("aaaa", "bbbb", 1234);
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa = new Pessoa("João", 25, "12345679");
        pessoas.add(pessoa);

        Pessoa pessoa2 = new Pessoa("Pedro", 28, "12345679");
        pessoas.add(pessoa2);

        Pessoa pessoa3 = new Pessoa("Jose", 35, "12345679");
        pessoas.add(pessoa3);

        Pessoa pessoa4 = new Pessoa("Lucas", 10, "12345679");
        pessoas.add(pessoa4);

        Carro carro = new Carro("aaa","aaaa" , 1234);
        pessoa.veiculo = carro;

        
    }
}
