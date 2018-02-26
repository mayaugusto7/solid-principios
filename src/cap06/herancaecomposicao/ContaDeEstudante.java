package cap06.herancaecomposicao;

public class ContaDeEstudante extends ContaComum {

    @Override
    public void rende() throws ContaNaoRendeException {
        throw new ContaNaoRendeException();
    }
}
