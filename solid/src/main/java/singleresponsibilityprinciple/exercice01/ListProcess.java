package singleresponsibilityprinciple.exercice01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListProcess {
    public static List<Integer> process() {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        List<Integer> list = ListAdd.add(scanner, nums);
        scanner.close();
        return list;
    }

}
