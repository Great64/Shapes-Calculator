package com.company;

public class TriangleBasedPrism {

    //fields
    double base;
    private double traingleheight;
    private double prismheight;
    private double sideone;
    private double sidetwo;
    private Rectangle rectangle1;
    private Rectangle rectangle2;
    private Rectangle rectangle3;
    private Triangle triangle;

    //methods
    public void setBase(double base) {

        //Make sure triangle + rectangle object has been created
        if (triangle == null) {
            triangle = new Triangle();
        }
        if (rectangle1 == null) {
            rectangle1 = new Rectangle();
        }

        this.base = base;

        triangle.setBase(base);
        rectangle1.setWidth(base);
    }

    public double getBase() {
        return base;
    }

    public void setTriangleheight(double traingleheight) {

        //Make sure triangle object has been created
        if (triangle == null) {
            triangle = new Triangle();
        }

        this.traingleheight = traingleheight;

        triangle.setHeight(traingleheight);
    }

    public double getTraingleheight() {
        return traingleheight;
    }

    public void setSideone(double sideone) {

        //Make sure triangle + rectangle object has been created
        if (triangle == null) {
            triangle = new Triangle();
        }
        if (rectangle2 == null) {
            rectangle2 = new Rectangle();
        }

        this.sideone = sideone;

        triangle.setSideone(sideone);
        rectangle2.setWidth(sideone);
    }

    public double getSideone() {
        return sideone;
    }

    public void setSidetwo(double sidetwo) {

        //Make sure triangle + rectangle object has been created
        if (triangle == null) {
            triangle = new Triangle();
        }
        if (rectangle3 == null) {
            rectangle3 = new Rectangle();
        }

        this.sidetwo = sidetwo;

        triangle.setSidetwo(sidetwo);
        rectangle3.setWidth(sidetwo);
    }

    public double getSidetwo() {
        return sidetwo;
    }

    public void setPrismheight(double prismheight) {

        //Make sure rectangle objects has been created
        if (rectangle1 == null) {
            rectangle1 = new Rectangle();
        }
        if (rectangle2 == null) {
            rectangle2 = new Rectangle();
        }
        if (rectangle3 == null) {
            rectangle3 = new Rectangle();
        }

        this.prismheight = prismheight;

        rectangle1.setLength(prismheight);
        rectangle2.setLength(prismheight);
        rectangle3.setLength(prismheight);
    }

    public double getPrismheight() {
        return prismheight;
    }

    public double calcSurfaceArea() {
        //Make sure rectangle object has been created
        if (rectangle1 == null) {
            rectangle1 = new Rectangle();
        }
        if (rectangle2 == null) {
            rectangle2 = new Rectangle();
        }
        if (rectangle3 == null) {
            rectangle3 = new Rectangle();
        }
        if (triangle == null) {
            triangle = new Triangle();
        }
        return rectangle1.calcArea() + rectangle2.calcArea() + rectangle3.calcArea() + (triangle.calcArea() * 2);
    }

    public double calcVolume() {
        if (triangle == null) {
            triangle = new Triangle();
        }
        return triangle.calcArea() * prismheight;
    }

    public void display() {
        System.out.println("Base: " + getBase() + " cm" + "\nSide One: " + getSideone() + " cm" + "\nSide Two: " + getSidetwo() + " cm" + "\nTriangle Height: " + getTraingleheight() + " cm" + "\nPrism Height: " + getPrismheight() + " cm");
    }
}
