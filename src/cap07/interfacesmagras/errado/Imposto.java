package cap07.interfacesmagras.errado;

public interface Imposto {

    NotaFiscal geraNota() throws NaoGeraNotaException;

    double imposto(double valorCheio);
}
