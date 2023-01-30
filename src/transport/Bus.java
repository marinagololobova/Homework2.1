package transport;

public class Bus extends Transport<CategoryD> {
    private Capacity capacity;
    public Bus(String brand, String model, Capacity capacity, double engineVolume, CategoryD driver) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
    public void printType() {
        if (getCapacity() == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getCapacity());
        }
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

    @Override
    public void passDiagnostics() throws TransportTypeException{
        throw new TransportTypeException("Автобусы диагностику проходить не должны");
    }
}
