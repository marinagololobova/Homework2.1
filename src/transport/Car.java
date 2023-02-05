package transport;

import java.util.List;

public class Car extends Transport <CategoryB>{

    private Body body;

    public Car(String brand, String model, Body body, double engineVolume, CategoryB driver, List<Mechanic> mechanicsList) {
        super(brand, model, engineVolume, driver, mechanicsList);
        this.body = body;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public void printType() {
        if (getBody() == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBody());
        }
    }


    @Override
    public void startMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " начал движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " закончил движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль на пит стопе");
    }


    @Override
    public void bestLapTime() {
        double min = 70;
        double max = 100;
        double bestTime = (min + (max - min) * Math.random());
        System.out.println("Лучшее время круга легкового автомобиля: " + bestTime);
    }

    @Override
    public void maxSpeed() {
        double min = 120;
        double max = 190;
        double bestTime = (min + (max - min) * Math.random());
        System.out.println("Максимальная скорость автомобиля: " + bestTime);
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Легковой автомобиль может проходить диагностику");
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
        return "Ремонтируем автомобиль";
    }

}
