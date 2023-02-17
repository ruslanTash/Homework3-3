import Transport.*;

public class Main {
    public static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет учавтствовать в заезде");
    }

    public static void main(String[] args) throws Exception  {
        Car car1 = new Car("Lada", "Priora", 1.6);
        Car car2 = new Car("Lada", "Vesta", 1.8);
        Car car3 = new Car("Audi", "R10", 5.5);
        Car car4 = new Car("BMW", "M3", 4.5);

        Bus bus1 = new Bus("Volvo", "B12", 12);
        Bus bus2 = new Bus("Higer", "H2", 8);
        Bus bus3 = new Bus("PAZ", "3205", 5.5);
        Bus bus4 = new Bus("LUAZ", "MoonWalker", 8.5);

        Truck truck1 = new Truck("Renault", "T Hight", 13);
        Truck truck2 = new Truck("Volvo", "FH4", 16);
        Truck truck3 = new Truck("KAMAZ", "S5", 12);
        Truck truck4 = new Truck("MAN", "1105", 9);
        Truck truck = new Truck(null, null, 0);

        DriverB driverB = new DriverB("Шумахер Михаил Алексеевич", true, 28);
        DriverC driverC = new DriverC("Хоук Линкольн Иванович", true, 15);
        DriverD driverD = new DriverD("Грагерт Александр Александрович", true, 10);


        car1.passDiagnostic();
        truck2.passDiagnostic();
        bus3.passDiagnostic();


    }
}