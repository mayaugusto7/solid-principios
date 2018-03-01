package cap07.interfacesmagras.errado;

public class ISS implements Imposto {

    @Override
    public NotaFiscal geraNota() {
        return new NotaFiscal("Alguma informacao aqui", "Alguma outra informacao aqui");
    }

    @Override
    public double imposto(double valorCheio) {
        return 0.1 * valorCheio;
    }
}
