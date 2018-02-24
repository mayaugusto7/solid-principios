package cap03.principio.invercao.dependencias.correcao.abstracao.acoplamento;


public class NotaFiscalDao implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Salvando Nota Fiscal...");
    }
}
