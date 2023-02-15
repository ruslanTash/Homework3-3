package Transport;

public class DriverB extends Driver {
    public DriverB(String name, boolean hasLicense, int experience) {
        super(name, hasLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель " + getName() + " начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель " + getName() + " остановил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель " + getName() + " заправляет автомобиль");
    }
}
