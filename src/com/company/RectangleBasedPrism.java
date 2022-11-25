package com.company;

public class RectangleBasedPrism {

    //field
    private double length;
    private double width;
    private double height;
    private Rectangle rectangle;

    //methods
    public void setLength(double length) {

        //Make sure rectangle object has been created
        if (rectangle == null) {
            rectangle = new Rectangle();
        }

        this.length = length;

        rectangle.setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {

        //Make sure rectangle object has been created
        if (rectangle == null) {
            rectangle = new Rectangle();
        }

        this.width = width;

        rectangle.setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double calcSurfaceArea() {
        //Make sure rectangle object has been created
        if (rectangle == null) {
            rectangle = new Rectangle();
        }
        return 2 * (width * height + length * width + length * height);
    }

    public double calcVolume() {
        //Make sure rectangle object has been created
        if (rectangle == null) {
            rectangle = new Rectangle();
        }
        return rectangle.calcArea() * height;
    }

    public void display() {
        System.out.println("Length: " + getLength() + " cm" + "\nWidth: " + getWidth() + " cm" + "\nHeight: " + getHeight() + " cm");
    }
}
