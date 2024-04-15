import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void addItem(ItemPedido item) {
        this.itens.add(item);
    }

    public List<ItemPedido> getItens() {
        return this.itens;
    }
}