import HW_3_3.*;
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Lada", "Granta", 2015, "Россия", "Жёлтый", 180,
                5, "седан", 1.6, "x451po77", "МКПП 5", false, new Car.Key(false, false));

        System.out.println(myCar.toString());
    }
}