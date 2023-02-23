package Transport;

import java.io.IOException;
import java.util.List;

public class Bus extends Transport<DriverD> implements Competable {
    private Type type;

    public Bus(String brand, String model, double engineVolume, DriverD driver, List<Mechanic> mechanicList, Type type) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.type = type;
    }

    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    public Bus(String brand, String model, double engineVolume) {
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
        System.out.println("Автобус " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус " + getBrand() + " закончил движение");
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
    public void passDiagnostic() throws TransportTypeException {
        try {
            throw new TransportTypeException();
        } catch (TransportTypeException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " заехал на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        int minBound = 90;
        int maxBound = 200;
        int best = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лушчее время круга автобуса " + getBrand() + " " + best + " сек.");
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int best = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лушчая скорость автобуса " + getBrand() + " " + best + " км/ч.");
    }

    public enum Type {
        VERYSMALL(null, 10),
        SMALL(10, 25),
        AVERAGE(25, 50),
        BIG(50, 80),
        VERYBIG(80, null);


        private Integer minCountofSeats;
        private Integer maxCountOfSeats;

        Type(Integer minCountofSeats, Integer maxCountOfSeats) {
            this.minCountofSeats = minCountofSeats;
            this.maxCountOfSeats = maxCountOfSeats;
        }

        @Override
        public String toString() {
            if (minCountofSeats == null) {
                return "Вместимость: до " + maxCountOfSeats + " мест";
            } else if (maxCountOfSeats == null) {
                return "Вместимость: от " + minCountofSeats + " мест";
            } else {
                return "Вместимость: от " + minCountofSeats + " до " + maxCountOfSeats + " мест";
            }
        }
    }


}
