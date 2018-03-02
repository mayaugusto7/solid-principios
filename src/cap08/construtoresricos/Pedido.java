package cap08.construtoresricos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;

    private double valorTotal;

    private List<Item> itens;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.valorTotal = 0;
        this.itens = new ArrayList<>();
    }

    public void adicionaItem(Item it) {
        itens.add(it);
        recalculaValorTota();
    }

    private void recalculaValorTota() {

    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
