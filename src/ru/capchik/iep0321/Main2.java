package ru.capchik.iep0321;

import ru.capchik.iep0321.figures.Rectangle;
import ru.capchik.iep0321.figures.Square;

public class Main2 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Square square = new Square(10, 10);

        System.out.println(rectangle);
        System.out.println(square);

        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());
    }
}
