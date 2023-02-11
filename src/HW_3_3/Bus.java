package HW_3_3;

public class Bus extends Transport {
    private int defaultSeats = 8;
    private int seats;

    public Bus(String model, int year, String country, String color, int speed, int seats) {
        super(model, year, country, color, speed);
        this.seats = seats < 8 ? defaultSeats : seats;
    }


    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats < 8 ? defaultSeats : seats;
    }

    @Override
    public String toString() {
        return super.toString() +
                "seats= " + seats + "пассажиров\n";
    }
}
