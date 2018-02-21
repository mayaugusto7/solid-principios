package cap02.coesao.srp;

/**
 * A classe cresce a medida que aparece um novo cargo e uma nova regra de calculo
 */

public class CalculadoraSalario {

    private static final String DESENVOLVEDOR = "DESENVOLVEDOR";
    private static final String DBA = "DBA";
    private static final String TESTER =  "TESTER";

    public double calcula(Funcionario funcionario) {

        if (DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return dezOuVintePorcento(funcionario);
        }

        if (DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
            return quinzeOuVinteCincoPorcento(funcionario);
        }

        throw new RuntimeException("funcionario invalido");
    }

    private double quinzeOuVinteCincoPorcento(Funcionario funcionario) {
        return 0;
    }

    private double dezOuVintePorcento(Funcionario funcionario) {
        return 0;
    }
}
