package solid.liskovsubtitutionprinciple;

public class App {
    public static void main(String[] args) {

        // it is called "design smell"

        Vehicule v = new ElectricCar("Ford", 6);
        v.speedUp();
        v.speedDown();
        v.fuel();

    }
}
