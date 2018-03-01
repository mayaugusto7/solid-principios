package cap07.interfacesmagras.correcao;

import cap07.interfacesmagras.errado.NotaFiscal;

public class ISS implements  CalculadoraDeImposto, GeradorDeNota {

    @Override
    public double imposto(double valorCheio) {
        return 0;
    }

    @Override
    public NotaFiscal geraNota() {
        return null;
    }
}
