package solid.singleresponsibilityprinciple.exercice01;

import java.util.List;
import java.util.Scanner;

import static solid.singleresponsibilityprinciple.exercice01.App.THRESHOLD;

public class ListAdd {
    public static List<Integer> add(Scanner s, List<Integer> nums) {

        while(nums.size() < THRESHOLD) {

            String sc = s.nextLine();

            if (!isValid(sc))
                continue;


            nums.add(Integer.parseInt(sc));
        }
        return nums;
    }

    private static boolean isValid(String sc) {
        try {
            Integer.parseInt(sc);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }

        int num = Integer.parseInt(sc);

        if(num<0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }
}
