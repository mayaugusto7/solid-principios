package cap04.ocp.correcao;

public class TabelaDePrecoGO implements TabelaDePreco {

    @Override
    public double descontoPara(double valor) {

        if ( valor > 5000 ) return 0.05;

        if ( valor > 1000 ) return 0.03;

        return 0;
    }
}
