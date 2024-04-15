public class ItemPedido {
    private String nome;
    private int quantidade;
    private double preco;

    public ItemPedido(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double getPreco() {
        return this.preco;
    }
}
