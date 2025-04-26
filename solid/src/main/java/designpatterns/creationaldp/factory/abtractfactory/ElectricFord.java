package designpatterns.creationaldp.factory.abtractfactory;

public class ElectricFord implements Car{
    @Override
    public void assemb() {
        System.out.println("Electric Ford");
    }
}
