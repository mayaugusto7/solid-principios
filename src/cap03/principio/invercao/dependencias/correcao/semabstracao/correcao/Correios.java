package cap03.principio.invercao.dependencias.correcao.semabstracao.correcao;

public class Correios {

    public void enviaPorSedex10(NotaFiscal nf) {
        System.out.println("Sedex 10...");
    }

    public void enviaPorSedexComum(NotaFiscal nf) {
        System.out.println("Sedex Normal...");
    }
}
