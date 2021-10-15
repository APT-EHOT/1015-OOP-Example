package ru.capchik.iep0321;

public class Car {

    private String brand;
    private int maxSpeed;
    private String color;
    private Engine engine;
    private boolean isEngineOn;
    private int fuelAmount;

    static int carsAmount = 0;

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public Car(String brand, int maxSpeed, String color, Engine engine, boolean isEngineOn, int fuelAmount) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.engine = engine;
        this.isEngineOn = isEngineOn;
        this.fuelAmount = fuelAmount;
        carsAmount++;
    }

    public Car() {
        this.brand = "Volvo";
        this.maxSpeed = 120;
        this.color = "Red";
        this.engine = new Engine(8);
        this.isEngineOn = false;
        carsAmount++;
    }

    public Car(String brand, int maxSpeed, Engine engine, boolean isEngineOn) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.isEngineOn = isEngineOn;
        carsAmount++;
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", isEngineOn=" + isEngineOn +
                ", fuelAmount=" + fuelAmount +
                '}';
    }

    public void igniteOn() {
        if (!isEngineOn)
            isEngineOn = true;
    }

    public int getOffroadSpeed() {
        return maxSpeed / 2;
    }


}
