package com.company;

public class Trapezoid {

    //fields
    private double basetwo;
    private double base;
    private double sideone;
    private double sidetwo;
    private double height;

    //methods
    public void setBasetwo(double basetwo) {
        this.basetwo = basetwo;
    }

    public double getBasetwo() {
        return basetwo;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setSideone(double sideone) {
        this.sideone = sideone;
    }

    public double getSideone() {
        return sideone;
    }

    public void setSidetwo(double sidetwo) {
        this.sidetwo = sidetwo;
    }

    public double getSidetwo() {
        return sidetwo;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double calcPerimeter() {
        double result = basetwo + base + sideone + sidetwo;
        return result;
    }

    public double calcArea() {
        double result = ((basetwo + base) * height) / 2;
        return result;
    }

    public void display() {
        System.out.println("Base: " + getBase() + " cm" + "\nSecond Base: " + getBasetwo() + " cm" + "\nSide One: " + getSideone() + " cm" + "\nSide Two: " + getSidetwo() + " cm" + "\nHeight: " + getHeight() + " cm");
    }
}
