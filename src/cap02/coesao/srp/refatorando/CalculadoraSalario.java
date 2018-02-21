package cap02.coesao.srp.refatorando;

import cap02.coesao.srp.Funcionario;
import cap02.coesao.srp.Cargo;

/**
 * A classe cresce a medida que aparece um novo cargo e uma nova regra de calculo
 */

public class CalculadoraSalario {

    public double calcula(Funcionario funcionario) {

        if (Cargo.DESENVOLVEDOR.name().equals(funcionario.getCargo())) {
            return new QuinzeOuVinteCincoPorCento().calcula(funcionario);
        }

        if (Cargo.DBA.name().equals(funcionario.getCargo()) ||
                Cargo.TESTER.name().equals(funcionario.getCargo())) {
            return new QuinzeOuVinteCincoPorCento().calcula(funcionario);
        }

        throw new RuntimeException("funcionario invalido");
    }

}
