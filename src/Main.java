public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Car ladaGranta = new Car();
        ladaGranta.setBrand("Lada");
        ladaGranta.setModel("Granta");
        ladaGranta.setEngineVolume(1.7);
        ladaGranta.setColor("желтый");
        ladaGranta.setProductionYear(2015);
        ladaGranta.setProductionCountry("Россия");

        Car audiA8 = new Car();
        audiA8.setBrand("Audi");
        audiA8.setModel("A8 50 L TDI quattro");
        audiA8.setEngineVolume(3.0);
        audiA8.setColor("черный");
        audiA8.setProductionYear(2020);
        audiA8.setProductionCountry("Германия");

        Car bmwZ8 = new Car();
        bmwZ8.setBrand("BMW");
        bmwZ8.setModel("Z8");
        bmwZ8.setEngineVolume(3.0);
        bmwZ8.setColor("черный");
        bmwZ8.setProductionYear(2021);
        bmwZ8.setProductionCountry("Германия");

        Car kiaSportage = new Car();
        kiaSportage.setBrand("Kia");
        kiaSportage.setModel("Sportage 4-го поколения");
        kiaSportage.setEngineVolume(2.4);
        kiaSportage.setColor("красный");
        kiaSportage.setProductionYear(2018);
        kiaSportage.setProductionCountry("Южная корея");

        Car hyundaiAvante = new Car();
        hyundaiAvante.setBrand("Hyundai");
        hyundaiAvante.setModel("Avante");
        hyundaiAvante.setEngineVolume(1.6);
        hyundaiAvante.setColor("оранжевый");
        hyundaiAvante.setProductionYear(2016);
        hyundaiAvante.setProductionCountry("Южная корея");

        System.out.println(ladaGranta + "\n" + audiA8 + "\n" + bmwZ8 + "\n" + kiaSportage + "\n" + hyundaiAvante);

        System.out.println("Задание 2");
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(lada + "\n" + audi + "\n" + bmw + "\n" + kia + "\n" + hyundai);


    }
} 