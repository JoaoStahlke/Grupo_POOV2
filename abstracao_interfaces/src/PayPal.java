public class PayPal implements PaymentMethod {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getPaymentMethodType() {
        return "PayPal";
    }

    @Override
    public void pay(double amount) {
    }
}