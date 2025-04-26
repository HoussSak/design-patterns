package solid.dependencyinversionprinciple;

//low level module
public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL database");
    }
    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL database");
    }
}
