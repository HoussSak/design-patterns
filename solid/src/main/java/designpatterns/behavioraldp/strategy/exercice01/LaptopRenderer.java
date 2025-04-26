package designpatterns.behavioraldp.strategy.exercice01;

import javax.swing.*;

public class LaptopRenderer implements DeviceStrategyRender {

    @Override
    public void showImage() {
        System.out.println("Showing an image on laptop...");
    }
}
