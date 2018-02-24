package cap04.ocp.correcao;

public class FreteGO implements ServicoDeEntrega {

    @Override
    public double para(String cidade) {

        if ( "GOIANIA".equals(cidade.toUpperCase()) ) {
            return 10;
        }

        return 20;
    }
}
