package com.codegym;

public class Circle extends Shape implements Resizeable{
    double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "A Circle with radius = " + this.radius + ", which is a subclass of" + super.toString();
    }
    public void resize(double percent){
        this.radius = this.radius + (this.radius / 100 * percent);
    }
    public void resize(){
        this.radius = this.radius + (this.radius / 100 * Math.floor(Math.random() * (100 - 1 + 1) + 1));
    }
}
