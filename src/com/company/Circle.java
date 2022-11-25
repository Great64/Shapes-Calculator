package com.company;

public class Circle {

    //fields
    private double diameter;
    private double radius;

    //methods
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public double calcRadiusArea() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }

    public double calcRadiusCircumference() {
        double result = (2 * Math.PI) * radius;
        return result;
    }

    public double calcDiameterArea() {
        double result = (2 * Math.PI) * (diameter / 2);
        return result;
    }

    public double calcDiameterCircumference() {
        double result = Math.PI * diameter;
        return result;
    }

    public void radiusDisplay() {
        System.out.println("Radius: " + getRadius() + " cm" + "\nDiameter: " + getRadius() * 2 + " cm");
    }

    public void diameterDisplay() {
        System.out.println("Radius: " + getDiameter() / 2 + " cm" + "\nDiameter: " + getDiameter() + " cm");
    }
}
