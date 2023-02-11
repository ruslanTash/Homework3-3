package Transport;

public abstract class Transport{
    private String delaultBrand = "default";
    private String defaultModel = "default";
    private double defaultEngineValume = 1.5;
    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand == null || brand.isEmpty() ? delaultBrand : brand;
        this.model = model == null || model.isEmpty() ? defaultModel : model;
        this.engineVolume = engineVolume <= 0 ? defaultEngineValume : engineVolume;
    }


    public abstract void startMoving();
    public abstract void stopMoving();

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
