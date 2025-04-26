package designpatterns.creationaldp.factory.abtractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if (factory.equalsIgnoreCase("ELECTRIC")) {
            return new ElectricCarFactory();
        }
        else if (factory.equalsIgnoreCase("PETROL")) {
            new PetrolCarFactory();
        }
        return null;
    }
}
