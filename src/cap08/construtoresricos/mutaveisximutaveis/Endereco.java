package cap08.construtoresricos.mutaveisximutaveis;

/**
 * Para termos uma classe imutavel. Basta evitar o uso de setters,
 por exemplo. Ou, se você precisar dar um método que modifica o conteúdo
 do objeto, esse objeto deve devolver uma nova instância dessa classe,
 com o novo valor. Veja, por exemplo, a classe Endereco a seguir, imutável.
 Repare que, ao mudar a rua, ela devolve uma nova instância da classe:
 */
public class Endereco {

    private final String rua;
    private final int numero;
    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    // getRua e getNumero aqui
    public Endereco setRua(String novaRua) {
        return new Endereco(novaRua, numero);
    }
}
