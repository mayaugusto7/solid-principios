package cap02.coesao.srp.refatorando;

import cap02.coesao.srp.Funcionario;

public class DezOuVintePorCento implements RegraDeCalculo {

    @Override
    public double calcula(Funcionario funcionario) {

        if (funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        }

        return funcionario.getSalarioBase() * 0.9;
    }
}
