public class CreditCard implements PaymentMethod {
    private String NumeroCartao;
    private String expirationDate;
    private String cvv;

    public CreditCard(String cardNumber, String expirationDate, String cvv) {
        this.NumeroCartao = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public String getPaymentMethodType() {
        return "Credit Card";
    }

    @Override
    public void pay(double amount) {
    }
}