package designpatterns.behavioraldp.strategy.exercice01;

public class App {

    public static void main(String[] args) {
        ImageRenderer renderer = new ImageRenderer();
        renderer.setDeviceStrategyRender(new LaptopRenderer());
        renderer.show();
        renderer.setDeviceStrategyRender(new TVRenderer());
        renderer.show();
    }
}
