package com.company;

public class Parallelogram {

    //fields
    double base;
    double height;
    double sides;

    //methods
    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double getSides() {
        return sides;
    }

    public double calcPerimeter() {
        double result = (base + base + sides + sides);
        return result;
    }

    public double calcArea() {
        double result = base * height;
        return result;
    }

    public void display() {
        System.out.println("Base: " + getBase() + " cm" + "\nSecond Base: " + getSides() + " cm" + "\nHeight: " + getHeight() + " cm");
    }
}
