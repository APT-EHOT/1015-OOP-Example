package ru.capchik.iep0321;

public class Main {

    public static void main(String[] args) {
        Engine engine8 = new Engine(8);
        Engine engine12 = new Engine(12);

        System.out.println(Car.carsAmount);

        Car car1 = new Car("Mercedes", 200, "Black", engine8, false, 0);
        Car car2 = new Car("Audi", 200, engine8, false);
        Car car3 = new Car();


        System.out.println(Car.carsAmount);
    }
}
