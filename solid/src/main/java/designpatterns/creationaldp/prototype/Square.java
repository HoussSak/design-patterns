package designpatterns.creationaldp.prototype;

public class Square extends Shape {
    public Square(int height, int width) {
        super(height, width);
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

    @Override
    public Shape cloneObject() {
            //this is the prototype pattern
        return new Square(height, width);
    }
}
