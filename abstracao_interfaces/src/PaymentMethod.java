public interface PaymentMethod {
    String getPaymentMethodType();
    void pay(double amount);
}
