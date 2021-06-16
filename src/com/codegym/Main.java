package com.codegym;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(7, 8);
        shapes[2] = new Square(9);
        shapes[3] = new Square(4);
        shapes[4] = new Rectangle(2, 9);
        shapes[5] = new Circle(8);
        for (Shape shape : shapes) {
            System.out.println(shape + " Before change");
            System.out.println(shape.getArea());
            if (shape instanceof Circle){
                Resizeable resizeable = (Circle) shape;
                resizeable.resize();
            }
            else if (shape instanceof Rectangle){
                Resizeable resizeable = (Rectangle) shape;
                resizeable.resize();
            }
            else if (shape instanceof Square){
                Resizeable resizeable = (Square) shape;
                resizeable.resize();
            }
            System.out.println(shape + " After change");
            System.out.println(shape.getArea());
        }
    }
}
