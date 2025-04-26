package designpatterns.behavioraldp.strategy;

// the abstract layer in between the high level modules and low level modules
public class OperationManager {
    // we have to use composition
    // BECAUSE THE BEHAVIOUR CAN BE CHANGED AT RUN-TIME
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int num1, int num2) {
        strategy.execute(num1, num2);
    }
}
