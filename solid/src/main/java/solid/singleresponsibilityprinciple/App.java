package solid.singleresponsibilityprinciple;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");
        // we can get the values
        Pair process = InputProcessor.process();

        // check whether the inputs are fine or not
        if (!ViolationChecker.isValid(process)) {
            System.out.println("One of the input is invalid...");
        }

        int firstInteger = Integer.parseInt(process.getFirst());
        int secondInteger = Integer.parseInt(process.getSecond());

        // do the mathematical operation
        int result = Operation.execute(firstInteger, secondInteger);

        System.out.println("The result is: " + result);
        System.out.println("End of the application!");

    }
}
