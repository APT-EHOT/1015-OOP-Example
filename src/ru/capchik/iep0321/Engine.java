package ru.capchik.iep0321;

public class Engine {

    private int numOfCyls;

    public Engine(int numOfCyls) {
        this.numOfCyls = numOfCyls;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "numOfCyls=" + numOfCyls +
                '}';
    }
}
