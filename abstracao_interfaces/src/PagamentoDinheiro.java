public class PagamentoDinheiro implements Pagamento {
    @Override
    public void efetuarPagamento() {
        System.out.println("Payment made by cash!");
    }

    @Override
    public double calcularTroco() {
        return 10.0;
    }
}