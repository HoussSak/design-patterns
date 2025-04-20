package liskovsubtitutionprinciple;

public abstract class Vehicule implements Fuel {
    protected String type;
    protected int age;

    public Vehicule(String type, int age) {
        this.type = type;
        this.age = age;
    }

    protected void speedUp() {
        System.out.println("Vehicule speeded up");
    }

    protected void speedDown() {
        System.out.println("Vehicule speed down");
    }
}
