package cap04.ocp.correcao;

public class FreteSP implements ServicoDeEntrega {

    @Override
    public double para(String cidade) {

        if ( "SAO PAULO".equals(cidade.toUpperCase()) ) {
            return 15;
        }

        return 30;
    }
}
