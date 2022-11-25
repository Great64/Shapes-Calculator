package com.company;

public class Cube {

    //fields
    private double length;

    //methods
    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double calcSurfaceArea() {
        return 6 * Math.pow(length, 2);
    }

    public double calcVolume() {
        return Math.pow(length, 3);
    }

    public void display() {
        System.out.println("Length: " + getLength() + " cm");
    }
}
