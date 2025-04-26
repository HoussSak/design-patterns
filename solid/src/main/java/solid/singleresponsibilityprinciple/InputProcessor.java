package solid.singleresponsibilityprinciple;

import java.util.Scanner;

public class InputProcessor {

    public static Pair process() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String firstNumber = scanner.nextLine();

        System.out.print("Enter the second number: ");
        String secondNumber = scanner.nextLine();
        scanner.close();

        return new Pair(firstNumber, secondNumber);
    }
}
