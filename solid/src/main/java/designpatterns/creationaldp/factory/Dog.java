package designpatterns.creationaldp.factory;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog Eating...");
    }
}
