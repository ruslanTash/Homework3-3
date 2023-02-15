package Transport;

public enum Load {
    N1(null, 3.5F),
    N2(3.5F, 12F),
    N3(12F, null);


    private Float minLoad;
    private Float maxLoad;

    Load(Float minLoad, Float maxLoad) {
        this.minLoad = minLoad;
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        if (minLoad == null) {
            return this.name() + ". Грузоподъёмность: до " + maxLoad + " тонн";
        } else if (maxLoad == null) {
            return this.name() + ". Грузоподъёмность: от " + minLoad + "тонн";
        } else {
            return this.name() + ". Грузоподъёмность: от " + minLoad + " до " + maxLoad + "тонн";
        }
    }

}
