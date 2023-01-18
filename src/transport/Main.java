package transport;
import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "механика", "лифтбек", "АА 100 А",4, true, new Car.Key(false, false));
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "автомат", "хетчбек", "АА 200 А", 5, true, new Car.Key(false, true));
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "робот", "седан", "АА 300 А", 4, false, new Car.Key(true, false));
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "механика", "седан", "АА 400А", 4, true, new Car.Key(true, true));
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "механика", "универсал", "АА 500 А", 5, false, new Car.Key(false, false));

        System.out.println(lada + "\n" + audi + "\n" + bmw + "\n" + kia + "\n" + hyundai);

        Car car = new Car("", null, 0, "", 0, "", null, "", null, 0, true, null);
        System.out.println(car);

    }
} 