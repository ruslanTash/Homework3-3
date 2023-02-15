package Transport;

public abstract class Driver {

    private final String name;
    private boolean hasLicense;
    private int experience;

    public Driver(String name, boolean hasLicense, int experience) {
        this.name = name;
        this.hasLicense = hasLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean isHasLicense() {
        return hasLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return name + ", наличие прав: " + hasLicense + ", стаж " + experience + " лет.";
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refuel();

}
