package transport;

import static transport.Transport.checkEmptyValues;

public class Mechanic {
    private String fullName;
    private String company;

    public Mechanic(String fullName, String company) {
        this.fullName = checkFullName(fullName);
        this.company = checkCompany(company);
    }

    public static String checkFullName (String value) {
        return checkEmptyValues(value, "default");
    }

    public static String checkCompany (String value) {
        return checkEmptyValues(value, "default");
    }

    public void performMaintenance() {
        System.out.println("Механник " + fullName + " провел техобслуживние автомобилю ");
    }

    public void fixCar() {
        System.out.println("починил машину");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механник: " + fullName;
    }
}
