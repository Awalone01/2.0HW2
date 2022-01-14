package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Transopt Lada = new Car("Lada 2110", 4);
        Transopt Lexus = new Car("Lexus GS300", 4);
        Transopt Volvo = new Truck("Volvo FL", 6);
        Transopt Ural = new Truck("УРАЛ-43206", 4);
        Transopt Stern = new Bicycle("Stern Energy", 2);

        ServiceStation station = new ServiceStation();
        station.check(Lada);
        station.check(Lexus);
        station.check(Stern);
        station.check(Volvo);
        station.check(Ural);
    }
}
