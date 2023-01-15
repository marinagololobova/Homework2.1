
public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car() {

    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = checkPropertiesCar(brand);
        this.model = checkPropertiesCar(model);
        this.engineVolume = checkEngineVolume(engineVolume);
        this.color = checkColor(color);
        this.productionYear = checkProductionYear(productionYear);
        this.productionCountry = productionCountry;
    }

    public static String checkEmptyValues (String value, String defaultValues) {
        if (value == null || value.isEmpty() || value.isBlank()){
            return defaultValues;
        } else {
            return value;
        }
    }

    public static String checkPropertiesCar (String value) {
        return checkEmptyValues(value, "default");
    }

    public static double checkEngineVolume (double value) {
        return value <= 0 ? 1.5 : value;
    }

    public static String checkColor (String value) {
        return checkEmptyValues(value, "белый");
    }

    public static int checkProductionYear (int value) {
        return value <= 0 ? 2000 : value;
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

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + productionYear + " года выпуска, страна сборки: " + productionCountry + ", цвет: " + color + ", oбъем двигателя - " + engineVolume + " л.";
    }
}
