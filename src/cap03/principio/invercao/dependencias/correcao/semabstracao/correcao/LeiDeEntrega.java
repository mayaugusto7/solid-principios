package cap03.principio.invercao.dependencias.correcao.semabstracao.correcao;

public class LeiDeEntrega {

    public boolean deveEntregarUrgente(NotaFiscal nf) {
        return nf.isUrgente();
    }
}
