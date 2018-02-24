import cap04.ocp.correcao.CalculadoraDePrecos;
import cap04.ocp.correcao.ServicoDeEntrega;
import cap04.ocp.correcao.TabelaDePreco;
import cap04.ocp.errado.Compra;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraDePrecosTest {

    @Test
    public void deveCalcularDescontoEFrete() {

        TabelaDePreco simuladorTabelaDePreco = mock(TabelaDePreco.class);
        ServicoDeEntrega simuladorDeEntrega = mock(ServicoDeEntrega.class);

        CalculadoraDePrecos calculadoraDePrecos = new CalculadoraDePrecos(simuladorTabelaDePreco, simuladorDeEntrega);

        when(simuladorTabelaDePreco.descontoPara(50)).thenReturn(5.0);
        when(simuladorDeEntrega.para("SAO PAULO")).thenReturn(10.0);

        double valor = calculadoraDePrecos.calcula(new Compra(50, "SAO PAULO"));

        assertEquals(55.0, valor, 0.0001);

    }

}
