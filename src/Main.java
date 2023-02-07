import HW_3_3.*;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Lada", "Granta", 2015, "Россия", "Жёлтый", 180,
                5, "седан", 1.6, "x451po77", "МКПП 5", false, new Car.Key(false, false));

        System.out.println(myCar.toString());

        Bus bus1 = new Bus("Volvo B12", 2016, "Швеция", "Серый", 110, 60);
        Bus bus2 = new Bus("ПАЗИК", 2005, "Россия", "Ржавый", 0, 180);
        Bus bus3 = new Bus("Higer", 2020, "Китай", "Жёлтый", 0, 40);
        bus3.setSpeed(90);
        System.out.println(bus1.toString());
        System.out.println(bus2.toString());
        System.out.println(bus3.toString());
    }
}