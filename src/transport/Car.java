package transport;

import java.time.LocalDate;

public class Car extends Transport{

    private double engineVolume;
    private String transmission;
    private final String bodyworkType;
    private String registrationNumber;
    private final int numberPlaces;
    private boolean winterTires;
    private Key key;


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyworkType,
               String registrationNumber,
               int numberPlaces,
               boolean winterTires,
               Key key, double maxSpeed) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
        this.engineVolume = checkEngineVolume(engineVolume);
        this.transmission = checkTransmission(transmission);
        this.bodyworkType = checkBodyworkType(bodyworkType);
        this.registrationNumber = checkRegistrationNumber(registrationNumber);
        this.numberPlaces = checkNumberPlaces(numberPlaces);
        this.winterTires = winterTires;
        setKey(key);
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


    public static String checkTransmission (String value) {
        return checkEmptyValues(value, "default");
    }

    public static String checkBodyworkType (String value) {
        return checkEmptyValues(value, "default");
    }

    public static String checkRegistrationNumber (String value) {
        return checkEmptyValues(value, "без номера");
    }

    public static int checkNumberPlaces (int value) {
        return value <= 0 ? 5 : value;
    }


    public void changeTiresForSeasonalOnes (int month) {
        LocalDate today = LocalDate.now();
        month = today.getMonthValue();
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            winterTires = true;
        } else {
            winterTires = false;
        }
    }


    public double getEngineVolume() {
        return engineVolume;
    }


    public String getTransmission() {
        return transmission;
    }

    public String getBodyworkType() {
        return bodyworkType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberPlaces() {
        return numberPlaces;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setWinterTires(boolean tires) {
        this.winterTires = winterTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    @Override
    public String toString() {
        return super.toString() + ", oбъем двигателя - " + engineVolume + " л, коробка передач: " + transmission + ", кузов: " + bodyworkType + ", регистрационный номер: " + registrationNumber + ", число мест: " + numberPlaces + ", " + (winterTires ? "зимняя" : "летняя") + " резина, " + key;
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return (remoteEngineStart ? "удаленный запуск двигателя" : "без удаленного запуска двигателя") + ", " + (keylessAccess ? "безключивой доступ" : "доступ с ключом");
        }
    }
}
