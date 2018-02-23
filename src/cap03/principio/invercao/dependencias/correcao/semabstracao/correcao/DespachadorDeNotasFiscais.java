package cap03.principio.invercao.dependencias.correcao.semabstracao.correcao;

public class DespachadorDeNotasFiscais {

    private NFDao dao;

    private CalcualadorDeImposto impostos;

    private EntregadorDeNFs entregadorDeNFs;

    public DespachadorDeNotasFiscais(NFDao dao, CalcualadorDeImposto impostos, EntregadorDeNFs entregadorDeNFs) {
        this.dao = dao;
        this.impostos = impostos;
        this.entregadorDeNFs = entregadorDeNFs;
    }

    public void processa(NotaFiscal nf) {

        double imposto = impostos.to(nf);
        nf.setImposto(imposto);
        entregadorDeNFs.entregarNf(nf);

        dao.persiste(nf);
    }
}
