import Transport.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Priora", 1.6);
        Car car2 = new Car("Lada", "Vesta", 1.8);
        Car car3 = new Car("Audi", "R10", 5.5);
        Car car4 = new Car("BMW", "M3", 4.5);

        Bus bus1 = new Bus("Volvo", "B12", 12);
        Bus bus2 = new Bus("Higer", "H2", 8);
        Bus bus3 = new Bus("PAZ", "3205", 5.5);
        Bus bus4 = new Bus("LUAZ", "MoonWalker", 8.5);

        Transport truck1 = new Truck("Renault", "T Hight", 13);
        Transport truck2 = new Truck("Volvo", "FH4", 16);
        Transport truck3 = new Truck("KAMAZ", "S5", 12);
        Transport truck4 = new Truck("MAN", "1105", 9);
        Truck truck = new Truck(null, null, 0);

        System.out.println(truck);
        truck.pitStop();
        truck1.maxSpeed();




    }
}