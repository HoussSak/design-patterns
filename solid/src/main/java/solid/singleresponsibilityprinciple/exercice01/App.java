package solid.singleresponsibilityprinciple.exercice01;

import java.util.List;
public class App {

    public static final int THRESHOLD = 5;

    public static void main(String[] args) {

        System.out.println("Welcome to the Application!");
        List<Integer> process = ListProcess.process();
        Sotring.sort(process);



        for(int num : process)
            System.out.print(num+" ");
    }
}
