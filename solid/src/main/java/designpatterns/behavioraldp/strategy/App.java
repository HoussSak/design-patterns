package designpatterns.behavioraldp.strategy;

public class App {
    public static void main(String[] args) {

        OperationManager manager = new OperationManager();

        manager.setStrategy(new Addition());
        manager.execute(10,5);
        manager.setStrategy(new Substraction());
        manager.execute(20,5);
        manager.setStrategy(new Multiplication());
        manager.execute(30,5);


        OperationManagerBAD op = new OperationManagerBAD();
        op.execute(new Addition(), 10,10);

    }
}
