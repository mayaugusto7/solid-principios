package cap03.principio.invercao.dependencias.correcao.abstracao.acoplamento;

public class EnviadorDeEmail implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Enviando email Nota Fiscal...");
    }
}
