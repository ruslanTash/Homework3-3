package Transport;

import java.util.List;

public class Car extends Transport<DriverB> implements Competable {

    private Type type;

    public Car(String brand, String model, double engineVolume, DriverB driver, List<Mechanic> mechanicList, Type type) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.type = type;
    }

    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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
    public void printType() {
        if (type == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getType());
        }
    }

    @Override
    public void passDiagnostic() {
        System.out.println(this.getBrand() + " проходит диагностику");
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

    public enum Type {
        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String bodyType;

        Type(String bodyType) {
            this.bodyType = bodyType;
        }


        @Override
        public String toString() {
            return "Тип кузова: " + bodyType;
        }
    }


}
