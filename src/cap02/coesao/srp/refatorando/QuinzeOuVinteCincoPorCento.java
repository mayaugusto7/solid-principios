package cap02.coesao.srp.refatorando;

import cap02.coesao.srp.Funcionario;

public class QuinzeOuVinteCincoPorCento implements RegraDeCalculo {

    @Override
    public double calcula(Funcionario funcionario) {

        if (funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        }

        return funcionario.getSalarioBase() * 0.85;
    }
}
