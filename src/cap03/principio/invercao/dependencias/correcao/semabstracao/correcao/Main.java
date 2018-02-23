package cap03.principio.invercao.dependencias.correcao.semabstracao.correcao;

public class Main {

    public static void main(String[] args) {

        NotaFiscal nf = new NotaFiscal(1000, 10, true);
        NotaFiscal nf2 = new NotaFiscal(1000, 10, false);

        DespachadorDeNotasFiscais dnf = new DespachadorDeNotasFiscais(new NFDao(), new CalcualadorDeImposto(),
                new EntregadorDeNFs(new LeiDeEntrega(), new Correios()));

        dnf.processa(nf);
        dnf.processa(nf2);

    }
}
