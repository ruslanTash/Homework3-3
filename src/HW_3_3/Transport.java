package HW_3_3;

public class Transport {
    private String defaultColor = "Белый";
    private int defaultSpeed = 90;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int speed;


    public Transport(String model, int year, String country, String color, int speed) {
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = (color == null || color.isEmpty()) ? defaultColor : color;
        this.speed = (speed <= 0 || speed > 500) ? defaultSpeed : speed;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setColor(String color) {
        this.color = (color == null || color.isEmpty()) ? defaultColor : color;
    }

    public void setSpeed(int speed) {
        this.speed = (speed <= 0 || speed > 500) ? defaultSpeed : speed;
    }

    @Override
    public String toString() {
        return  "model= " + model + "\n" +
                "year= " + year + "\n" +
                "country= " + country + "\n" +
                "color= " + color + "\n" +
                "speed= " + speed + " km/h\n";
    }
}
