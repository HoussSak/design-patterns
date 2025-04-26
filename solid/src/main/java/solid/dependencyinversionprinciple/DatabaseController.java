package solid.dependencyinversionprinciple;


// the high level module
public class DatabaseController {
    // we program to an interface - so we can achieve loosely coupled architecture
    private Database database;
    //private MySQLDatabase database;
    //private OracleDatabase database;

    public DatabaseController(Database database) {
        // tight banding: when we program to c class (instead of an interface)
        this.database = database;
    }

    public void connect() {
        database.connect();
    }
    public void disconnect() {
        database.disconnect();
    }
}
