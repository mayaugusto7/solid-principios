package cap05.encapsulamento;

import java.util.List;

public class Fatura {

    private double valor;

    private boolean pago;

    private List<Pagamento> pagamentos;

    public double getValor() {
        return valor;
    }

    public boolean isPago() {
        return pago;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void adicionaPagamento(Pagamento pagamento) {

        this.pagamentos.add(pagamento);

        if (valorTotalDosPagamentos() > this.valor) {

        }

    }

    private double valorTotalDosPagamentos() {

        double total = 0;

        for (Pagamento p : pagamentos) {
            total += p.getValorBoleto();
        }

        return total;
    }
}
