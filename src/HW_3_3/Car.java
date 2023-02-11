package HW_3_3;

public class Car extends Transport {
    private double defaultEngineVolume = 1.5;
    private String defaultGearBox = "МКПП";
    private String defaultBodyType = "седан";
    private String defaultRegistrationNumber = "";
    private int defaultSeats = 4;
    private final String brand;
    private final int seats;
    private final String bodyType;
    private double engineVolume;
    private String registrationNumber;
    private String gearBox;
    private boolean isWinterTires;
    private Key key;

    public Car(String brand, String model, int year, String country, String color, int speed, int seats, String bodyType, double engineVolume,
               String registrationNumber, String gearBox, boolean isWinterTires, Key key) {
        super(model, year, country, color, speed);
        this.brand = brand;
        this.seats = (seats < 1) ? defaultSeats : seats;
        this.bodyType = (bodyType == null || bodyType.isEmpty()) ? defaultBodyType : bodyType;
        this.engineVolume = (engineVolume <= 0) ? defaultEngineVolume : engineVolume;
        this.registrationNumber = (registrationNumber == null || registrationNumber.isEmpty()) ? defaultRegistrationNumber : registrationNumber;
        this.gearBox = (gearBox == null || gearBox.isEmpty()) ? defaultGearBox : gearBox;
        this.isWinterTires = isWinterTires;
        this.key = key;
    }

    public String getBrand() {
        return brand;
    }

    public int getSeats() {
        return seats;
    }

    public String getBodyType() {
        return bodyType;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getGearBox() {
        return gearBox;
    }

    public boolean isWinterTires() {
        return isWinterTires;
    }

    public Key getKey() {
        return key;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public void setWinterTires(boolean winterTires) {
        isWinterTires = winterTires;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return super.toString() +
                "brand= " + brand +
                "\nseats= " + seats +
                "\nbodyType= " + bodyType +
                "\nengineVolume= " + engineVolume +
                "\nregistrationNumber= " + registrationNumber +
                "\ngearBox= " + gearBox +
                "\nisWinterTires= " + isWinterTires +
                "\nkey= " + key +
                "\n";
    }

    public static class Key {
        private boolean remoteEngineStart;
        private boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return (remoteEngineStart ? "дистанционный запуск двигателя" : "без удалённого запуска двигателя") + ", "
                    + (keylessEntry ? "безключевой доступ" : "безключевой доступ отсутствует");
        }
    }
}
