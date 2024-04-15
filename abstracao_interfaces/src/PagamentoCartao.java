public class PagamentoCartao implements Pagamento {
    @Override
    public void efetuarPagamento() {
        System.out.println("Payment made by credit card!");
    }

    @Override
    public double calcularTroco() {
        return 0.0;
    }
}