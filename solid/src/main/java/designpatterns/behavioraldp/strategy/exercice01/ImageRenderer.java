package designpatterns.behavioraldp.strategy.exercice01;

public class ImageRenderer {

    private DeviceStrategyRender deviceStrategyRender;

    public void setDeviceStrategyRender(DeviceStrategyRender deviceStrategyRender) {
        this.deviceStrategyRender = deviceStrategyRender;
    }

    public  void show() {
        deviceStrategyRender.showImage();
    }
}
