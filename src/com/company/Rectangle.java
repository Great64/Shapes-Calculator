package com.company;

public class Rectangle {

    //fields
    private double length;
    private double width;

    //methods
    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double calcPerimeter() {
        double result = (length + length + width + width);
        return result;
    }

    public double calcArea() {
        double result = length * width;
        return result;
    }

    public void display() {
        System.out.println("Length: " + getLength() + " cm" + "\nWidth: " + getWidth() + " cm");

    }
}
