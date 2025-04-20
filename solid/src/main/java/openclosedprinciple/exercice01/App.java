package openclosedprinciple.exercice01;

public class App {
    public static void main(String[] args) {
        SorterProcessor.executeSorting(new InsertionSort());
        SorterProcessor.executeSorting(new MergeSort());
        SorterProcessor.executeSorting(new SelectionSort());
    }
}
