package solid.interfacesegregationprinciple.exercice01;

public class Employee implements IEmployee{
    @Override
    public void salary() {
        System.out.println("Employee salary");
    }
}
