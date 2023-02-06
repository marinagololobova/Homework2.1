package transport;

import java.util.List;

public abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private List<Mechanic> mechanicsList;


    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanicsList) {
        this.brand = checkBrand(brand);
        this.model = checkModel(model);
        this.engineVolume = checkEngineVolume(engineVolume);
        this.driver = driver;
        this.mechanicsList = mechanicsList;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public List<Mechanic> getMechanicsList() {
        return mechanicsList;
    }

    public static String checkEmptyValues (String value, String defaultValues) {
        if (value == null || value.isEmpty() || value.isBlank()){
            return defaultValues;
        } else {
            return value;
        }
    }

    public static String checkBrand (String value) {
        return checkEmptyValues(value, "default");
    }

    public static String checkModel (String value) {
        return checkEmptyValues(value, "default");
    }

    public static double checkEngineVolume (double value) {
        return value <= 0 ? 1.5 : value;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void printType();

    public abstract void passDiagnostics() throws TransportTypeException;
    public abstract void findDriverName();
    public abstract void findMechanics();
    public abstract String repair();
    public boolean checkAddingQueueServiceStation() {
        try {
            passDiagnostics();
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Водитель " + driver.getFullName() + " управляет автомобилем " + getBrand() + " " + getModel() + " и будет участвовать в заезде";
    }
}
