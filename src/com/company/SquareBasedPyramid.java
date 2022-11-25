package com.company;

public class SquareBasedPyramid {

    //fields
    private double base;
    private double height;
    private double slant;
    private Triangle triangle;

    //methods
    public void setBase(double base) {

        //Make sure square object has been created
        if (triangle == null) {
            triangle = new Triangle();
        }

        this.base = base;

        triangle.setBase(base);
    }

    public double getBase() {
        return base;
    }

    public void setSlant(double slant) {

        //Make sure square object has been created
        if (triangle == null) {
            triangle = new Triangle();
        }

        this.slant = slant;

        triangle.setHeight(slant);
    }

    public double getSlant() {
        return slant;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double calcSurfaceArea() {
        return triangle.calcArea() * 4 + Math.pow(triangle.base, 2);
    }

    public double calcVolume() {
        //Make sure square object has been created
        if (triangle == null) {
            triangle = new Triangle();
        }
        return (Math.pow(triangle.base, 2) * height) / 3;
    }

    public void display() {
        //Make sure square object has been created
        if (triangle == null) {
            triangle = new Triangle();
        }
        System.out.println("Base: " + getBase() + " cm" + "\nTriangle height: " + getHeight() + " cm" + "\nPrism height: " + getSlant() + " cm");
    }
}
