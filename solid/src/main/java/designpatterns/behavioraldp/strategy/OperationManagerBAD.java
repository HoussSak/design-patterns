package designpatterns.behavioraldp.strategy;

// the abstract layer in between the high level modules and low level modules
public class OperationManagerBAD {

    // cyclomatic complexity  https://en.wikipedia.org/wiki/Cyclomatic_complexity
    public void execute(Object o, int num1, int num2) {
        if (o instanceof Addition) {
            ((Addition)o).execute(num1, num2);
        } else if (o instanceof Multiplication) {
            ((Multiplication)o).execute(num1, num2);
        }
    }
}
