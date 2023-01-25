package transport;

public class CategoryC extends Driver{

    public CategoryC(String fullName, boolean driversLicense, int experience) {
        super(fullName, driversLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории C " + getFullName() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории C " + getFullName() + " остановился");
    }

    @Override
    public void refuelCar(){
        System.out.println("Водитель категории C " + getFullName() + " заправил автомобиль");
    }
}
