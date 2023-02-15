package Transport;

public class Truck extends Transport<DriverC> implements Competable {
    private Type type;

    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    public Truck(String brand, String model, double engineVolume) {
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
        System.out.println("Трак " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Трак " + getBrand() + " закончил движение");
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
    public void pitStop() {
        System.out.println("Трак " + getBrand() + " заехал на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        int minBound = 60;
        int maxBound = 180;
        int best = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лушчее время круга Трака " + getBrand() + " " + best + " сек.");
    }

    @Override
    public void maxSpeed() {
        int minBound = 90;
        int maxBound = 130;
        int best = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лушчая скорость Трака " + getBrand() + " " + best + " км/ч.");
    }

    public enum Type {
        N1(null, 3.5F),
        N2(3.5F, 12F),
        N3(12F, null);


        private Float minLoad;
        private Float maxLoad;

        Type(Float minLoad, Float maxLoad) {
            this.minLoad = minLoad;
            this.maxLoad = maxLoad;
        }

        @Override
        public String toString() {
            if (minLoad == null) {
                return this.name() + ". Грузоподъёмность: до " + maxLoad + " тонн";
            } else if (maxLoad == null) {
                return this.name() + ". Грузоподъёмность: от " + minLoad + "тонн";
            } else {
                return this.name() + ". Грузоподъёмность: от " + minLoad + " до " + maxLoad + "тонн";
            }
        }

    }
}
