package Transport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T extends Driver> implements Competable {
    private String delaultBrand = "default";
    private String defaultModel = "default";
    private double defaultEngineValume = 1.5;
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

    private List<Mechanic> mechanicList;


    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanicList) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = driver;
        this.mechanicList = mechanicList;
    }

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand == null || brand.isEmpty() ? delaultBrand : brand;
        this.model = model == null || model.isEmpty() ? defaultModel : model;
        this.engineVolume = engineVolume <= 0 ? defaultEngineValume : engineVolume;
    }

    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = driver;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void printType();
    public abstract void passDiagnostic() throws TransportTypeException;

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + "\nМодель: " + model + "\nОбъём двигателя: " + engineVolume + "\n";
    }
}
