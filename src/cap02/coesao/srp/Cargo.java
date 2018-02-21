package cap02.coesao.srp;

import cap02.coesao.srp.refatorando.DezOuVintePorCento;
import cap02.coesao.srp.refatorando.QuinzeOuVinteCincoPorCento;
import cap02.coesao.srp.refatorando.RegraDeCalculo;

public enum Cargo {

    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorCento()),
    TESTER(new QuinzeOuVinteCincoPorCento());

    private RegraDeCalculo regraDeCalculo;

    Cargo(RegraDeCalculo regraDeCalculo) {
        this.regraDeCalculo = regraDeCalculo;
    }

    public RegraDeCalculo getRegraDeCalculo() {
        return regraDeCalculo;
    }
}
