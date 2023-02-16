package Transport;

public abstract class Transport<T extends Driver> implements Competable {
    private String delaultBrand = "default";
    private String defaultModel = "default";
    private double defaultEngineValume = 1.5;
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

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

    //    abstract enum Type();
//    abstract Type getType();
    abstract void printType();

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


    @Override
    public String toString() {
        return "Марка: " + brand + "\nМодель: " + model + "\nОбъём двигателя: " + engineVolume + "\n";
    }

}
