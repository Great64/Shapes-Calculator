package com.company;

public class Triangle {

    //fields
    double base;
    double sideone;
    double sidetwo;
    double height;

    //methods
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

    public double calcPerimeter(){
        double result = sideone + base + sidetwo;
        return result;
    }

    public double calcArea(){
        double result = (base * height)/2;
        return result;
    }

    public void display(){
        System.out.println("Base: " + getBase() + " cm" + "\nSide One: " + getSideone() + " cm" + "\nSide Two: " + getSidetwo() + " cm" + "\nHeight: " + getHeight() + " cm");
    }
}
