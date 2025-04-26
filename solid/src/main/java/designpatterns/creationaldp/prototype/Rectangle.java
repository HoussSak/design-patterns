package designpatterns.creationaldp.prototype;

public class Rectangle extends Shape {
    public Rectangle(int height, int width) {
        super(height, width);
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    @Override
    public Shape cloneObject() {
            //this is the prototype pattern
        return new Rectangle(height, width);
    }
}
