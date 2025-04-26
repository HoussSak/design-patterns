package solid.dependencyinversionprinciple.exercice01;

public class PaymentController {
    private Payment payment;
    public PaymentController(Payment payment) {
        this.payment = payment;
    }

    public void pay() {
        payment.pay();
    }

    public void refund() {
        payment.refund();
    }
}
