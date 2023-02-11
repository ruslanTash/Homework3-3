package Transport;

public class Truck extends Transport implements Competable{
    private double defaultEngineVolume = 5;

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Трак " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Трак " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Трак " + getBrand() + " заехал на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        int minBound = 60;
        int maxBound = 180;
        int best = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лушчее время круга Трака " + getBrand() + " " + best + " сек.");
    }

    @Override
    public void maxSpeed() {
        int minBound = 90;
        int maxBound = 130;
        int best = (int)(minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лушчая скорость Трака " + getBrand() + " " + best + " км/ч.");
    }
}
