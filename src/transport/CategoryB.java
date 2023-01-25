package transport;

public class CategoryB extends Driver{

    public CategoryB(String fullName,
                     boolean driversLicense,
                     int experience) {
        super(fullName, driversLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getFullName() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории В " + getFullName() + " остановился");
    }

    @Override
    public void refuelCar(){
        System.out.println("Водитель категории В " + getFullName() + " заправил автомобиль");
    }

}
