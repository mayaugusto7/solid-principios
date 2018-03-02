package cap08.construtoresricos;

public class Main {

    public static void main(String[] args) {

        Cliente maycon = new Cliente("Maycon", "6235523152");

        Pedido festa = new Pedido(maycon);

        festa.adicionaItem(new Item("MUSICA AMBIENTE", 450.0));
        festa.adicionaItem(new Item("SALGADO", 50.0));
        festa.adicionaItem(new Item("REFRIGERANTE", 50.0));

        System.out.println(festa.getValorTotal());
    }
}
