package solid.dependencyinversionprinciple.exercice01;

public class PayPal implements Payment{
    @Override
    public void pay() {
        System.out.println("Pay PAL");
    }

    @Override
    public void refund() {
        System.out.println("Refund PAL");
    }
}
