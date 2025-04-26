package solid.dependencyinversionprinciple.exercice01;

public class Payoneer implements Payment{
    @Override
    public void pay() {
        System.out.println("Pay one");
    }

    @Override
    public void refund() {
        System.out.println("Refund one");

    }
}
