package solid.dependencyinversionprinciple;

//low level module
public class OracleDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to Oracle database");
    }
    @Override
    public void disconnect() {
        System.out.println("Disconnected from Oracle database");
    }
}
