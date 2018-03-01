package cap07.interfacesmagras.errado;

public class NotaFiscal {

    private double valor;

    private double imposto;

    private String titulo;

    private String descricao;

    public NotaFiscal(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

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

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
