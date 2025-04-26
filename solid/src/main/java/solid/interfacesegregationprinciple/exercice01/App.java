package solid.interfacesegregationprinciple.exercice01;

public class App {
    public static void main(String[] args) {
        ICEO iceo = new Ceo();

        iceo.addBonus();
        iceo.salary();
        iceo.makeDecisions();
        iceo.addStocks();
    }
}
