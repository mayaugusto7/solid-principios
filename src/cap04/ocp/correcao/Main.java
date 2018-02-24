package cap04.ocp.correcao;

import cap04.ocp.errado.Compra;

public class Main {

    public static void main(String[] args) {

        CalculadoraDePrecos calculadoraDePrecos = new CalculadoraDePrecos(new TabelaDePrecoSP(), new FreteSP());
        double valorFinalProduto = calculadoraDePrecos.calcula(new Compra(1000.0, "SAO PAULO"));

        System.out.println("PRODUTO SP R$ " + valorFinalProduto);

        calculadoraDePrecos = new CalculadoraDePrecos(new TabelaDePrecoGO(), new FreteGO());
        valorFinalProduto = calculadoraDePrecos.calcula(new Compra(1500.0, "GUAPO"));

        System.out.println("PRODUTO GO R$ " + valorFinalProduto);

        calculadoraDePrecos = new CalculadoraDePrecos(new TabelaDePrecoRJ(), new FreteRJ());
        valorFinalProduto = calculadoraDePrecos.calcula(new Compra(2000.0, "RIO DE JANEIRO"));

        System.out.println("PRODUTO RJ R$ " + valorFinalProduto);

    }
}
