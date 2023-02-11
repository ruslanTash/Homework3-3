package Transport;

public class Bus extends Transport implements Competable{

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " заехал на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        int minBound = 90;
        int maxBound = 200;
        int best = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лушчее время круга автобуса " + getBrand() + " " + best + " сек.");
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int best = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лушчая скорость автобуса " + getBrand() + " " + best + " км/ч.");
    }
}
