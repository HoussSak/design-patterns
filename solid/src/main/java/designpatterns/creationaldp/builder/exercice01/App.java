package designpatterns.creationaldp.builder.exercice01;

public class App {
    public static void main(String[] args) {

        Student build = new Student.Builder()
                .university("University")
                .name("Houssem")
                .getAge(18).build();
        System.out.println(build.getName());

    }
}
