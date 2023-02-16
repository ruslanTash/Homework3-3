package Transport;

public enum Seat {
    VERYSMALL(null, 10),
    SMALL(10, 25),
    AVERAGE(25, 50),
    BIG(50, 80),
    VERYBIG(80, null);


    private Integer minCountofSeats;
    private Integer maxCountOfSeats;

    Seat(Integer minCountofSeats, Integer maxCountOfSeats) {
        this.minCountofSeats = minCountofSeats;
        this.maxCountOfSeats = maxCountOfSeats;
    }

    @Override
    public String toString() {
        if (minCountofSeats == null) {
            return "Вместимость: до " + maxCountOfSeats + " мест";
        } else if (maxCountOfSeats == null) {
            return "Вместимость: от " + minCountofSeats + " мест";
        } else {
            return "Вместимость: от " + minCountofSeats + " до " + maxCountOfSeats + " мест";
        }
    }
}

