package ru.capchik.iep0321.figures;

public class Rectangle {

    protected int height;
    protected int width;


    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
