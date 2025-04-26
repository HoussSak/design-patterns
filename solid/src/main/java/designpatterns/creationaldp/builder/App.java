package designpatterns.creationaldp.builder;

public class App {
    public static void main(String[] args) {
           Person p  =  new Person.Builder("Kevin","kevin@gmail.com")
                   .build();
        System.out.println(p.getName());
    }
}
