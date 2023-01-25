package transport;

public class Bus extends Transport<CategoryD> {
    public Bus(String brand, String model, double engineVolume, CategoryD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " начал движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус " + getBrand() + " закончил движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус на пит стопе");
    }

    @Override
    public void bestLapTime() {
        double min = 90;
        double max = 130;
        double bestTime = (min + (max - min) * Math.random());
        System.out.println("Лучшее время круга автобуса: " + bestTime);
    }

    @Override
    public void maxSpeed() {
        double min = 60;
        double max = 100;
        double bestTime = (min + (max - min) * Math.random());
        System.out.println("Максимальная скорость автобуса: " + bestTime);
    }
}
