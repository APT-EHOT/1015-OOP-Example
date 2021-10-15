package ru.capchik.iep0321.figures;

import ru.capchik.iep0321.figures.Rectangle;

public class Square extends Rectangle {

    public Square(int height, int width) {
        super(height, width);
    }

    @Override
    public int getArea() {
        System.out.print("I am overrided!");
        return height * height;
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
