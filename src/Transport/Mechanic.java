package Transport;

public class Mechanic {
    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механик " + name + ", кампания " + company;
    }

    public void fixVehicle(Transport transport){
        System.out.println(toString() + " чинит автомобиль " + transport.getBrand());
    }

    public void passDiagnostic(Transport transport) throws TransportTypeException {
        System.out.print(toString() + ". ");
        transport.passDiagnostic();
    }
}
