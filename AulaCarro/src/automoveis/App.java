package automoveis;

public class App {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda", "Bis", 2012);
        moto.qtd_combustivel = 10.0;
        moto.exebirInformacoes();
        moto.abastecer(5.0);
        System.out.println(moto.qtd_combustivel);
    }
}
