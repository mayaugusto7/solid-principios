package cap06.herancaecomposicao;

public class ContaComum {

    protected double saldo;

    public ContaComum() {
        this.saldo = 0;
    }

    public void deposita(double valor) throws ValorInvalidoException {

        if ( valor <= 0) {
            throw new ValorInvalidoException();
        }

        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void rende() throws ContaNaoRendeException {
        this.saldo *= 1.1;
    }
}
