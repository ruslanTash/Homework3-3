package Transport;

public class Car extends Transport<DriverB> implements Competable {

    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автомобиль " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " заехал на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        int minBound = 40;
        int maxBound = 140;
        int best = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лушчее время круга Трака " + getBrand() + " " + best + " сек.");
    }

    @Override
    public void maxSpeed() {
        int minBound = 120;
        int maxBound = 160;
        int best = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лушчая скорость Трака " + getBrand() + " " + best + " км/ч.");
    }


}
