package singleresponsibilityprinciple;

public class ViolationChecker {

    public static boolean isValid(Pair pair) {

        String First = pair.getFirst();
        String Second = pair.getSecond();
        try {
            Integer.parseInt(First);
        } catch (NumberFormatException e) {
            return false;
        }
        try {
            Integer.parseInt(Second);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
