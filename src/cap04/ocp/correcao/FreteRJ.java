package cap04.ocp.correcao;

public class FreteRJ implements ServicoDeEntrega {

    @Override
    public double para(String cidade) {

        if ( "RIO DE JANEIRO".equals(cidade.toUpperCase()) ) {
            return 20;
        }

        return 40;
    }
}
