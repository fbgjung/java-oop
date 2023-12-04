package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.height = 8;
        rectangle.width = 5;
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.isSquare();
    }
}
