package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Transopt car = new Car("car1", 4);
        Transopt car2 = new Car("car2", 4);
        Transopt truck = new Truck("truck1", 6);
        Transopt truck2 = new Truck("truck2", 8);
        Transopt bicycle = new Bicycle("bicycle1", 2);
        Transopt bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation3 station = new ServiceStation1();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}
