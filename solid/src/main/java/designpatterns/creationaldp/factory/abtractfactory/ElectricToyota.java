package designpatterns.creationaldp.factory.abtractfactory;

public class ElectricToyota implements Car{
    @Override
    public void assemb() {
        System.out.println("Electric Toyota");
    }
}
