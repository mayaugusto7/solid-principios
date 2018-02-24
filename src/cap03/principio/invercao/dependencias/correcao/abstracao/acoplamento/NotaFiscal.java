package cap03.principio.invercao.dependencias.correcao.abstracao.acoplamento;

public class NotaFiscal {

    private double valor;

    private double imposto;

    public NotaFiscal(double valor, double imposto) {
        this.valor = valor;
        this.imposto = imposto;
    }

    public double getValor() {
        return valor;
    }

    public double getImposto() {
        return imposto;
    }
}
