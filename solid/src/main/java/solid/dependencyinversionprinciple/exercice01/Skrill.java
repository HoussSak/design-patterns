package solid.dependencyinversionprinciple.exercice01;

public class Skrill implements Payment{
    @Override
    public void pay() {
        System.out.println("Pay Skrill");
    }

    @Override
    public void refund() {
        System.out.println("Refund Skrill");
    }
}
