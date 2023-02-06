package transport;

import java.lang.reflect.Type;
import java.util.List;

public class Trucks extends Transport<CategoryC> {
    private LoadCapacity loadCapacity;

    public Trucks(String brand, String model, LoadCapacity loadCapacity, double engineVolume, CategoryC driver, List<Mechanic> mechanicsList) {
        super(brand, model, engineVolume, driver, mechanicsList);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printType() {
        if (getLoadCapacity() == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getLoadCapacity());
        }
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " начал движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " закончил движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик на пит стопе");
    }

    @Override
    public void bestLapTime() {
        double min = 80;
        double max = 120;
        double bestTime = (min + (max - min) * Math.random());
        System.out.println("Лучшее время круга грузовика: " + bestTime);
    }

    @Override
    public void maxSpeed() {
        double min = 70;
        double max = 110;
        double bestTime = (min + (max - min) * Math.random());
        System.out.println("Максимальная скорость грузовика: " + bestTime);
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Грузовой автомобиль может проходить диагностику");
    }

    @Override
    public void findDriverName() {
        System.out.println("Имя водителя " + getBrand() + " " + getModel() + ": " + getDriver().getFullName());
    }

    @Override
    public void findMechanics() {
        System.out.println("Механики " + getBrand() + " " + getModel() + ": " + getMechanicsList());
    }

    @Override
    public String repair() {
        return "Ремонтируем грузовик";
    }

}
