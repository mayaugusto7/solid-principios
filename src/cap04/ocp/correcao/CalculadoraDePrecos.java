package cap04.ocp.correcao;

import cap04.ocp.errado.Compra;

/**
 * Ao mesmo tempo, está fechada para modificação, afinal
 * não há razões para mudarmos o código dessa classe. Essa classe agora segue
 * o princípio do aberto-fechado
 */
public class CalculadoraDePrecos {

    private TabelaDePreco tabelaDePreco;

    private ServicoDeEntrega servicoDeEntrega;

    public CalculadoraDePrecos(TabelaDePreco tabelaDePreco, ServicoDeEntrega servicoDeEntrega) {
        this.tabelaDePreco = tabelaDePreco;
        this.servicoDeEntrega = servicoDeEntrega;
    }

    public double calcula(Compra produto) {

        double desconto = tabelaDePreco.descontoPara(produto.getValor());
        double frete = servicoDeEntrega.para(produto.getCidade());

        return produto.getValor() * ( 1 - desconto ) + frete;
    }
}
