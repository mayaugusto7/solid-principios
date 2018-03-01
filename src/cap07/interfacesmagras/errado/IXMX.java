package cap07.interfacesmagras.errado;

public class IXMX implements Imposto {

    @Override
    public NotaFiscal geraNota() throws NaoGeraNotaException {
        // lanca uma exceção
        throw new NaoGeraNotaException();
        // ou retornar nulo
        //return null;
    }

    @Override
    public double imposto(double valorCheio) {
        return 0.2 * valorCheio;
    }
}
