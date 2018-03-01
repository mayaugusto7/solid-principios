package cap07.interfacesmagras.correcao;

public class CalculadorDeImposto {

    public double calcula(Tributavel t) {
        double total = 0;
        for(Item item : t.itensASeremTributados()) {
            if(item.getValor()>1000)
                total+= item.getValor() * 0.02;
            else
                total+= item.getValor() * 0.01;
        }
        return total;
    }
}
