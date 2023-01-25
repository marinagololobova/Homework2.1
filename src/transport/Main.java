package transport;

public class Main {
    public static void main(String[] args) {
        CategoryB b1 = new CategoryB("b1", true, 5);
        CategoryB b2 = new CategoryB("b2", true, 7);
        CategoryB b3 = new CategoryB("b3", true, 3);
        CategoryB b4 = new CategoryB("b4", true, 8);

        Car lada = new Car("Lada", "Granta", 1.7, b1);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, b2);
        Car bmw = new Car("BMW", "Z8", 3.0, b3);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, b4);
        System.out.println(lada + "\n" + audi + "\n" + bmw + "\n" + kia);

        CategoryD d1 = new CategoryD("d1", true, 8);
        CategoryD d2 = new CategoryD("d2", true, 10);
        CategoryD d3 = new CategoryD("d3", true, 13);
        CategoryD d4 = new CategoryD("d4", true, 7);


        Bus bus1 = new Bus("Автобус", "1", 5.5, d1);
        Bus bus2 = new Bus("Автобус", "2", 6.2, d2);
        Bus bus3 = new Bus("Автобус", "3", 5.1, d3);
        Bus bus4 = new Bus("Автобус", "4", 6.0, d4);
        System.out.println(bus1 + "\n" + bus2 + "\n" + bus3 + "\n" + bus4);

        CategoryC c1 = new CategoryC("c1", true, 6);
        CategoryC c2 = new CategoryC("c2", true, 9);
        CategoryC c3 = new CategoryC("c3", true, 10);
        CategoryC c4 = new CategoryC("c4", true, 13);


        Trucks[] trucks = new Trucks[4];
        Trucks trucks1 = new Trucks("Грузовик", "1", 8.3, c1);
        Trucks trucks2 = new Trucks("Грузовик", "2", 7.5, c2);
        Trucks trucks3 = new Trucks("Грузовик", "3", 9.2, c3);
        Trucks trucks4 = new Trucks("Грузовик", "4", 10.0, c4);
        System.out.println(trucks1 + "\n" + trucks2 + "\n" + trucks3 + "\n" + trucks4);


    }
} 