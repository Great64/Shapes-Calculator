package com.company;

public class Cone {

    //fields
    private double radius;
    private double height;
    private double slant;
    private Circle circle;

    //methods
    public void setRadius(double radius) {

        //Make sure circle object has been created
        if (circle == null) {
            circle = new Circle();
        }

        this.radius = radius;

        circle.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setSlant(double slant) {
        this.slant = slant;
    }

    public double getSlant() {
        return slant;
    }

    public double calcSurfaceArea() {
        //make sure object has been created
        if (circle == null) {
            circle = new Circle();
        }
        return circle.calcRadiusArea() + (Math.PI * getRadius() * slant);
    }

    public double calcVolume() {
        //make sure object has been created
        if (circle == null) {
            circle = new Circle();
        }
        return (circle.calcRadiusArea() * height) / 3;
    }

    public void display() {
        System.out.println("Radius: " + getRadius() + " cm" + "\nHeight: " + getHeight() + " cm" + "\nSlant: " + getSlant() + " cm");
    }

}
