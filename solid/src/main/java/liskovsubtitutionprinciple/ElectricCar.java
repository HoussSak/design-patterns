package liskovsubtitutionprinciple;

public class ElectricCar extends Vehicule{
    public ElectricCar(String type, int age) {
        super(type, age);
    }

    @Override
    protected void speedUp() {
        System.out.println("Electric speeded up");
    }
    @Override
    protected void speedDown() {
        System.out.println("Electric speed down");
    }
    @Override
    public void fuel() {
        System.out.println("Electric car is being charged...");
    }
}
