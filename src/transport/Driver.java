package transport;

public abstract class Driver {
    private String fullName;
    private boolean driversLicense;
    private int experience;

    public Driver(String fullName, boolean driversLicense, int experience) {
        this.fullName = fullName;
        this.driversLicense = driversLicense;
        this.experience = experience;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refuelCar();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
