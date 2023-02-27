import Transport.*;

import java.util.*;
import java.util.List;

public class Main {
    public static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет учавтствовать в заезде");
    }

    public static void printDriverAndMechanics(Transport transport) {
        System.out.println(transport.getBrand() + " водитель - " + transport.getDriver() + ", механики - " + transport.getMechanicList());
    }

    public static void main(String[] args) throws TransportTypeException {
        List<Mechanic> allMechanics = new ArrayList<>(6);
        allMechanics.add(new Mechanic("Иннокентий Гаврилов", "Ferrari MotorSport"));
        allMechanics.add(new Mechanic("Иван Дураев", "KAMAZ-Master"));
        allMechanics.add(new Mechanic("Александр Олександров", "AvtoVAZ Drandull"));
        allMechanics.add(new Mechanic("Святослав Окоянов", "Swyat-Avto"));
        allMechanics.add(new Mechanic("Томар Алексадрович", "PIP-Stop"));
        allMechanics.add(new Mechanic("Валерий Зибенштейн", "TOP-Fraer"));

        DriverB driverB = new DriverB("Шумахер Михаил Алексеевич", true, 28);
        DriverC driverC = new DriverC("Хоук Линкольн Иванович", true, 15);
        DriverD driverD = new DriverD("Грагерт Александр Александрович", true, 10);


        Car car1 = new Car("Lada", "Priora", 1.6, driverB, allMechanics.subList(0, 2), Car.Type.SEDAN);
        Car car2 = new Car("Lada", "Vesta", 1.8);
        Car car3 = new Car("Audi", "R10", 5.5);
        Car car4 = new Car("BMW", "M3", 4.5);

        Bus bus1 = new Bus("Volvo", "B12", 12);
        Bus bus2 = new Bus("Higer", "H2", 8);
        Bus bus3 = new Bus("PAZ", "3205", 5.5);
        Bus bus4 = new Bus("LUAZ", "MoonWalker", 8.5);
        bus4.setType(Bus.Type.AVERAGE);
        bus4.setDriver(driverD);
        bus4.setMechanicList(allMechanics.subList(2, 4));

        Truck truck1 = new Truck("Renault", "T Hight", 13);
        Truck truck2 = new Truck("Volvo", "FH4", 16);
        Truck truck3 = new Truck("KAMAZ", "S5", 12);
        Truck truck4 = new Truck("MAN", "1105", 9);
        truck2.setMechanicList(allMechanics.subList(4, 6));
        truck2.setDriver(driverC);
        truck2.setType(Truck.Type.N3);


        List<Transport> participatingVehicle = new ArrayList<>();
        participatingVehicle.add(car1);
        participatingVehicle.add(bus4);
        participatingVehicle.add(truck2);


        allMechanics.get(1).passDiagnostic(car1);
        allMechanics.get(3).passDiagnostic(bus1);
        allMechanics.get(5).fixVehicle(bus1);
        allMechanics.get(0).passDiagnostic(bus1);

        for (int i = 0; i < participatingVehicle.size(); i++) {
            printDriverAndMechanics(participatingVehicle.get(i));
        }

        for (int i = 0; i < participatingVehicle.size(); i++) {
            participatingVehicle.get(i).passDiagnostic();
        }

        for (int i = 0; i < participatingVehicle.size(); i++) {
            System.out.println(participatingVehicle.get(i));
        }
        for (Transport transport : participatingVehicle) {
            System.out.println(transport.getMechanicList());
        }

        Station queue = new Station();

        for (Transport transport : participatingVehicle) {
            queue.addInQueue(transport);
        }

        for (Transport transport : participatingVehicle) {
            queue.doMaintrance(transport);
        }

//      Создайте множество водителей, чтобы в случае добавления одного и того же водителя в базу два раза, в консоль выводилась информация без повторов.
        Set<Driver> drivers = new HashSet<>();
        drivers.add(driverB);
        drivers.add(driverC);
        drivers.add(driverD);
        drivers.add(driverB);

        System.out.println(drivers);

    }
}