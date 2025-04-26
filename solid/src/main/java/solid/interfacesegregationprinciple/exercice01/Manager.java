package solid.interfacesegregationprinciple.exercice01;

public class Manager implements IManager{
    @Override
    public void hire() {
        System.out.println("Hire Manager");
    }

    @Override
    public void train() {
        System.out.println("Training Manager");
    }

    @Override
    public void addBonus() {
        System.out.println("Add Bonus");
    }

    @Override
    public void salary() {
        System.out.println("Salary Manager");

    }
}
