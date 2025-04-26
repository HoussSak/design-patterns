package solid.liskovsubtitutionprinciple;

public class PatrolCar extends Vehicule {
    public PatrolCar(String type, int age) {
        super(type, age);
    }
    @Override
    protected void speedUp() {
        System.out.println("Car speeded up");
    }
    @Override
    protected void speedDown() {
        System.out.println("Car speed down");
    }
    @Override
    public void fuel() {
        System.out.println("Car fuel");
    }
}
