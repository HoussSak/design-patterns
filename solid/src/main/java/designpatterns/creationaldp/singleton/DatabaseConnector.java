package designpatterns.creationaldp.singleton;

public class DatabaseConnector {
    // lazy version
    private static DatabaseConnector instance;
    // eager version
    //private static DatabaseConnector instance = new DatabaseConnector();
    private DatabaseConnector() {

    }
    public static DatabaseConnector getInstance() {
        // we just instantiate the class if necessary
        // IF WE HAVE MULTIPLE THREADS ???
        if (instance == null) {
            // This block can be entered by a single thread
            // PROBLEM: it is too slow (100x)
            synchronized (DatabaseConnector.class) {
                instance = new DatabaseConnector();
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to database");
    }
    public void disconnect() {
        System.out.println("Disconnected from database");
    }
}
