package transport;

public class Main {
    public static void main(String[] args) {
        CategoryB b1 = new CategoryB("b1", true, 5);
        CategoryB b2 = new CategoryB("b2", true, 7);
        CategoryB b3 = new CategoryB("b3", true, 3);
        CategoryB b4 = new CategoryB("b4", true, 8);

        Car[] cars = new Car[4];
        cars[0] = new Car("Lada", "Granta", Body.HATCHBACK, 1.7, b1);
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", Body.SEDAN, 3.0, b2);
        cars[2] = new Car("BMW", "Z8", Body.COUPE, 3.0, b3);
        cars[3] = new Car("Kia", "Sportage 4-го поколения", Body.CROSSOVER, 2.4, b4);
        for (Car i : cars) {
            System.out.println(i);
            i.printType();
            i.passDiagnostics();
        }


        CategoryC c1 = new CategoryC("c1", true, 6);
        CategoryC c2 = new CategoryC("c2", true, 9);
        CategoryC c3 = new CategoryC("c3", true, 10);
        CategoryC c4 = new CategoryC("c4", true, 13);

        Trucks[] trucks = new Trucks[4];
        trucks[0] = new Trucks("Грузовик", "1", LoadCapacity.N1, 8.3, c1);
        trucks[1] = new Trucks("Грузовик", "2", LoadCapacity.N2, 7.5, c2);
        trucks[2] = new Trucks("Грузовик", "3", LoadCapacity.N3, 9.2, c3);
        trucks[3] = new Trucks("Грузовик", "4", null, 10.0, c4);
        for (Trucks i : trucks) {
            System.out.println(i);
            i.printType();
            i.passDiagnostics();
        }

        CategoryD d1 = new CategoryD("d1", true, 8);
        CategoryD d2 = new CategoryD("d2", true, 10);
        CategoryD d3 = new CategoryD("d3", true, 13);
        CategoryD d4 = new CategoryD("d4", true, 7);


        Bus[] buses = new Bus[4];
        buses[0] = new Bus("Автобус", "1", null, 5.5, d1);
        buses[1] = new Bus("Автобус", "2", Capacity.VERYSMALL, 6.2, d2);
        buses[2] = new Bus("Автобус", "3", Capacity.VERYBIG, 5.1, d3);
        buses[3] = new Bus("Автобус", "4", Capacity.AVERAGE, 6.0, d4);
        for (Bus i : buses) {
            System.out.println(i);
            i.printType();
            try {
                i.passDiagnostics();
            } catch (TransportTypeException e) {
                System.out.println(e.getMessage());
            }

        }
    }
} 