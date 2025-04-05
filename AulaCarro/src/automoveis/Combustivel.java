package automoveis;

import custom.exeptions.TanqueCheioExeption;

public interface Combustivel {
    public void abastecer (double qtd_abastecida) throws TanqueCheioExeption;
}
