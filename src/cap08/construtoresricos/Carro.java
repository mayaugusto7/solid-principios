package cap08.construtoresricos;

public class Carro {

    private Pneu pneu;

    private Motor motor;

    public Carro(Pneu pneu, Motor motor) {
        this.pneu = pneu;
        this.motor = motor;
    }

    public Carro() {
        this (new Pneu(), new Motor()); // todo padrao
    }
}
