import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<PaymentMethod> paymentMethods = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addPaymentMethod(PaymentMethod paymentMethod) {
        paymentMethods.add(paymentMethod);
    }

    public void pay(double amount) {
        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.pay(amount);
        }
    }
}