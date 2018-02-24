package cap03.principio.invercao.dependencias.correcao.semabstracao.acoplamento;

public class DespachadorDeNotasFiscais {

    private NFDao dao;

    private CalcualadorDeImposto impostos;

    private LeiDeEntrega lei;

    private Correios correios;

    public DespachadorDeNotasFiscais(NFDao dao, CalcualadorDeImposto impostos, LeiDeEntrega lei, Correios correios) {
        this.dao = dao;
        this.impostos = impostos;
        this.lei = lei;
        this.correios = correios;
    }

    public void processa(NotaFiscal nf) {

        double imposto = impostos.to(nf);
        nf.setImposto(imposto);

        if (lei.deveEntregarUrgente(nf)) {
            correios.enviaPorSedex10(nf);
        } else {
            correios.enviaPorSedexComum(nf);
        }

        dao.persiste(nf);
    }
}
