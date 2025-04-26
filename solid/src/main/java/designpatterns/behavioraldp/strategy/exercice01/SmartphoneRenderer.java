package designpatterns.behavioraldp.strategy.exercice01;

public class SmartphoneRenderer implements DeviceStrategyRender {

    @Override
    public void showImage() {
        System.out.println("Showing an image on smartphone...");
    }
}
