package cap03.principio.invercao.dependencias.correcao.semabstracao.correcao;

public class EntregadorDeNFs {

    private LeiDeEntrega lei;

    private Correios correios;

    public EntregadorDeNFs(LeiDeEntrega lei, Correios correios) {
        this.lei = lei;
        this.correios = correios;
    }

    public void entregarNf(NotaFiscal nf) {

        if (this.lei.deveEntregarUrgente(nf)) {
            this.correios.enviaPorSedex10(nf);
        } else {
            this.correios.enviaPorSedexComum(nf);
        }
    }
}
