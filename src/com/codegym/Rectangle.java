package com.codegym;

public class Rectangle extends Shape implements Resizeable {
    double width;
    double length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public String toString() {
        return "A Rectangle with width = " + this.width + " and length= " + this.length + ", which is a subclass of" + super.toString();
    }

    public void resize(double percent) {
        this.width = this.width + (this.width / 100 * percent);
        this.length = this.length + (this.width / 100 * percent);
    }
    public void resize(){
        this.width = this.width + (this.width / 100 * Math.floor(Math.random() * (100 - 1 + 1) + 1));
        this.length = this.length + (this.length / 100 * Math.floor(Math.random() * (100 - 1 + 1) + 1));
    }
}