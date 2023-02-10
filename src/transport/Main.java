package transport;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CategoryB b1 = new CategoryB("b1", true, 5);
        CategoryB b2 = new CategoryB("b2", true, 7);
        CategoryB b3 = new CategoryB("b3", true, 3);
        CategoryB b4 = new CategoryB("b4", true, 8);

        CategoryC c1 = new CategoryC("c1", true, 6);
        CategoryC c2 = new CategoryC("c2", true, 9);
        CategoryC c3 = new CategoryC("c3", true, 10);
        CategoryC c4 = new CategoryC("c4", true, 13);

        CategoryD d1 = new CategoryD("d1", true, 8);
        CategoryD d2 = new CategoryD("d2", true, 10);
        CategoryD d3 = new CategoryD("d3", true, 13);
        CategoryD d4 = new CategoryD("d4", true, 7);

        List<Mechanic> mechanicsList = new ArrayList<>();
        Mechanic mechanic1 = new Mechanic("Семен Иванов", "компания 1");
        Mechanic mechanic2 = new Mechanic("Иван Семенов", "компания 2");
        Mechanic mechanic3 = new Mechanic("Сергей Петров", "компания 3");
        Mechanic mechanic4 = new Mechanic("Андрей Сидоров", "компания 4");
        mechanicsList.add(mechanic1);
        mechanicsList.add(mechanic2);
        mechanicsList.add(mechanic3);
        mechanicsList.add(mechanic4);

        List<Transport> transportList = new ArrayList<>();

        transportList.add(new Car("Lada", "Granta", Body.HATCHBACK, 1.7, b1, List.of(mechanic3)));
        transportList.add(new Car("Audi", "A8 50 L TDI quattro", Body.SEDAN, 3.0, b2, List.of(mechanic2)));
        transportList.add(new Car("BMW", "Z8", Body.COUPE, 3.0, b3, List.of(mechanic1)));
        transportList.add(new Car("Kia", "Sportage 4-го поколения", Body.CROSSOVER, 2.4, b4, List.of(mechanic4)));

        transportList.add(new Trucks("Грузовик", "1", LoadCapacity.N1, 8.3, c1, List.of(mechanic2)));
        transportList.add(new Trucks("Грузовик", "2", LoadCapacity.N2, 7.5, c2, List.of(mechanic1)));
        transportList.add(new Trucks("Грузовик", "3", LoadCapacity.N3, 9.2, c3, List.of(mechanic4)));
        transportList.add(new Trucks("Грузовик", "4", null, 10.0, c4, List.of(mechanic3)));

        transportList.add(new Bus("Автобус", "1", null, 5.5, d1, List.of(mechanic4)));
        transportList.add(new Bus("Автобус", "2", Capacity.VERYSMALL, 6.2, d2, List.of(mechanic2)));
        transportList.add(new Bus("Автобус", "3", Capacity.VERYBIG, 5.1, d3, List.of(mechanic3)));
        transportList.add(new Bus("Автобус", "4", Capacity.AVERAGE, 6.0, d4, List.of(mechanic1)));
        for (Transport i : transportList) {
            System.out.println(i);
            i.printType();
            try {
                i.passDiagnostics();
            } catch (TransportTypeException e) {
                System.out.println(e.getMessage());
            }
            i.findDriverName();
            i.findMechanics();
        }


        for (Mechanic i : mechanicsList) {
            System.out.println(i);
            i.performMaintenance();
            i.fixCar();
        }


        Queue<Transport> maintenanceQueue = new ArrayDeque<>();
        ServiceStation sto = new ServiceStation(maintenanceQueue);

        for (Transport i : transportList) {
            sto.addCarToTheQueue(i);
        }

        for (int i = 0; i <= maintenanceQueue.size(); i++) {
            sto.carryOutMaintenance(maintenanceQueue);
        }

        Map<Transport, List<Mechanic>> transportMechanicMap = new HashMap<>();
        transportMechanicMap.put(transportList.get(0), transportList.get(0).getMechanicsList());
        transportMechanicMap.put(transportList.get(1), transportList.get(1).getMechanicsList());
        transportMechanicMap.put(transportList.get(2), transportList.get(2).getMechanicsList());
        transportMechanicMap.put(transportList.get(3), transportList.get(3).getMechanicsList());
        transportMechanicMap.put(transportList.get(4), transportList.get(4).getMechanicsList());
        transportMechanicMap.put(transportList.get(5), transportList.get(5).getMechanicsList());
        transportMechanicMap.put(transportList.get(6), transportList.get(6).getMechanicsList());
        transportMechanicMap.put(transportList.get(7), transportList.get(7).getMechanicsList());
        transportMechanicMap.put(transportList.get(8), transportList.get(8).getMechanicsList());
        transportMechanicMap.put(transportList.get(9), transportList.get(9).getMechanicsList());
        transportMechanicMap.put(transportList.get(10), transportList.get(10).getMechanicsList());
        transportMechanicMap.put(transportList.get(11), transportList.get(11).getMechanicsList());

        for (Map.Entry<Transport, List<Mechanic>> entry : transportMechanicMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Set<Driver> driverSet = new HashSet<>();
        driverSet.add(b1);
        driverSet.add(b2);
        driverSet.add(b3);
        driverSet.add(b4);
        driverSet.add(c1);
        driverSet.add(c2);
        driverSet.add(c3);
        driverSet.add(c4);
        driverSet.add(d1);
        driverSet.add(d2);
        driverSet.add(d3);
        driverSet.add(d4);

        Iterator<Driver> iterator = driverSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
} 