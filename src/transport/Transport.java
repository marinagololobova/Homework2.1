package transport;

public abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

    //private String color;
    //private final int productionYear;
    /*private final String productionCountry;
    private double maxSpeed;*/

    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = checkBrand(brand);
        this.model = checkModel(model);
        this.engineVolume = checkEngineVolume(engineVolume);
        this.driver = driver;
        /*this.color = checkColor(color);
        this.productionYear = checkProductionYear(productionYear);
        this.productionCountry = checkProductionCountry(productionCountry);
        this.maxSpeed = checkMaxSpeed(maxSpeed);*/
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

    /*public static String checkColor (String value) {
        return checkEmptyValues(value, "белый");
    }

    public static int checkProductionYear (int value) {
        return value <= 0 ? 2000 : value;
    }

    public static String checkProductionCountry (String value) {
        return checkEmptyValues(value, "Россия");
    }

    public static double checkMaxSpeed (double value) {
        return value <= 0 ? 200 : value;
    }*/

    @Override
    public String toString() {
        //return getBrand() + " " + getModel() + ", мощность двигателя: " + engineVolume;
        return "Водитель " + driver.getFullName() + " управляет автомобилем " + getBrand() + " " + getModel() + " и будет участвовать в заезде";
    }
}
