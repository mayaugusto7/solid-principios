package cap05.encapsulamento;

public class Pagamento {

    private double valorBoleto;

    private MeioDePagamento meioDePagamento;

    public Pagamento(double valorBoleto, MeioDePagamento meioDePagamento) {
        this.valorBoleto = valorBoleto;
        this.meioDePagamento = meioDePagamento;
    }

    public double getValorBoleto() {
        return valorBoleto;
    }

    public MeioDePagamento getMeioDePagamento() {
        return meioDePagamento;
    }
}
