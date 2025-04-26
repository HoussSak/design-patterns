package designpatterns.creationaldp.singleton;

public enum Database {
    INSTANCE;

    public void connect() {
        System.out.println("Connected to database");
    }
    public void disconnect() {
        System.out.println("Disconnected from database");
    }
}
