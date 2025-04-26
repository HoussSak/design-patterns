package designpatterns.creationaldp.factory.abtractfactory;

public class App {
    public static void main(String[] args) {
        Car car = FactoryProducer.getFactory("ELECTRIC").getCar("TOYOTA");
        car.assemb();

    }
}
