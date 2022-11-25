package com.company;

public class Cylinder {

    //fields
    private double radius;
    private double height;
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

    public double calcSurfaceArea() {
        //make sure object has been created
        if (circle == null) {
            circle = new Circle();
        }
        return (circle.calcRadiusArea() * 2) + ((Math.PI * getRadius() * height) * 2);
    }

    public double calcVolume() {
        //make sure object has been created
        if (circle == null) {
            circle = new Circle();
        }
        return circle.calcRadiusArea() * height;
    }

    public void display() {
        System.out.println("Radius: " + getRadius() + " cm" + "\nHeight: " + getHeight() + " cm");
    }
}
