package solid.dependencyinversionprinciple.exercice01;

public class App {
    public static void main(String[] args) {
        Payoneer payoneer = new Payoneer();

        PaymentController controller = new PaymentController(payoneer);

        controller.pay();
        controller.refund();

    }
}
