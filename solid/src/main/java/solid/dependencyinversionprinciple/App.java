package solid.dependencyinversionprinciple;

public class App {
    public static void main(String[] args) {

        OracleDatabase db = new OracleDatabase();
        DatabaseController databaseController = new DatabaseController(db);
        databaseController.connect();
        databaseController.disconnect();
    }
}
