package designpatterns.behavioraldp.strategy.exercice01;

public class TVRenderer implements DeviceStrategyRender {

    @Override
    public void showImage() {
        System.out.println("Showing an image on TV...");
    }
}
