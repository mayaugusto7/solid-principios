package cap03.principio.invercao.dependencias.correcao.abstracao.acoplamento;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<AcaoAposGerarNota> acoes = new ArrayList<>();
        acoes.add(new EnviadorDeEmail());
        acoes.add(new NotaFiscalDao());

        GeradorDeNotaFiscal gnf = new GeradorDeNotaFiscal(acoes);
        gnf.gera(new Fatura(1000));

    }
}
