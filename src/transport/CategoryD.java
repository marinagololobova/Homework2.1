package transport;

public class CategoryD extends Driver {

    public CategoryD(String fullName, boolean driversLicense, int experience) {
        super(fullName, driversLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D " + getFullName() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории D " + getFullName() + " остановился");
    }

    @Override
    public void refuelCar(){
        System.out.println("Водитель категории D " + getFullName() + " заправил автомобиль");
    }
}
