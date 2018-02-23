package cap03.principio.invercao.dependencias.correcao.semabstracao.correcao;

public class NotaFiscal {

    private double valor;

    private double imposto;

    private boolean urgente;

    public NotaFiscal(double valor, double imposto, boolean urgente) {
        this.valor = valor;
        this.imposto = imposto;
        this.urgente = urgente;
    }

    public double getValor() {
        return valor;
    }

    public double getImposto() {
        return imposto;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
