package designpatterns.behavioraldp.strategy;

public class Addition implements Strategy {
    @Override
    public void execute(int number1, int number2) {
        System.out.println(number1 + number2);
    }
}
