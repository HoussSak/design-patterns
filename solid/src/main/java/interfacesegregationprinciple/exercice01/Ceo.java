package interfacesegregationprinciple.exercice01;

public class Ceo implements ICEO{
    @Override
    public void makeDecisions() {
        System.out.println("I'm a Ceo");
    }

    @Override
    public void addStocks() {
        System.out.println("Getting shares of the company...");

    }

    @Override
    public void salary() {
        System.out.println("Getting salary");

    }

    @Override
    public void addBonus() {
        System.out.println("Adding bonus");

    }
}
