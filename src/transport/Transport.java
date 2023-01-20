package transport;

import static transport.Car.checkEmptyValues;

public class Transport {
    private final String brand;
    private final String model;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private double maxSpeed;

    public Transport(String brand, String model, String color, int productionYear, String productionCountry, double maxSpeed) {
        this.brand = checkBrand(brand);
        this.model = checkModel(model);
        this.color = checkColor(color);
        this.productionYear = checkProductionYear(productionYear);
        this.productionCountry = checkProductionCountry(productionCountry);
        this.maxSpeed = checkMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static String checkBrand (String value) {
        return checkEmptyValues(value, "default");
    }

    public static String checkModel (String value) {
        return checkEmptyValues(value, "default");
    }

    public static String checkColor (String value) {
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
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " " + getProductionYear() + " года выпуска, страна сборки: " + getProductionCountry() + ", цвет: " + getColor() + ", максимальная скорость: " + getMaxSpeed() + " км/ч";
    }
}
