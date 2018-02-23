package cap03.principio.invercao.dependencias.correcao.abstracao.acoplamento;

public class Fatura {

    private double valorMensal;

    public Fatura(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public double getValorMensal() {
        return valorMensal;
    }
}
