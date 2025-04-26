package designpatterns.creationaldp.singleton;

public class App {
    public static void main(String[] args) {
        DatabaseConnector instance = DatabaseConnector.getInstance();
        instance.connect();

        Database.INSTANCE.connect();

    }
}
