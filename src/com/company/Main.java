package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    //constants
    public final static String Divider = "=========================================================================";

    // I am aware I can use "\n", however I believe the code is more modular without it

    //method for ui
    public static void ui() {
        System.out.println(Divider);
        System.out.println("Shape Calculator ~ Please choose from the options below");
        System.out.println(Divider);
        System.out.println("1) Rectangle");
        System.out.println("2) Parallelogram");
        System.out.println("3) Triangle");
        System.out.println("4) Trapezoid");
        System.out.println("5) Circle");
        System.out.println("6) Cylinder");
        System.out.println("7) Cube");
        System.out.println("8) Cone");
        System.out.println("9) Square Based Pyramid");
        System.out.println("10) Rectangle Based Prism");
        System.out.println("11) Triangle Based Prism");
        System.out.println("0) Exit");
        System.out.println(Divider);
    }

    //method for number error
    public static void error() {
        System.out.println(Divider);
        System.out.println("\n\tERROR: Please enter a number\n");
    }

    //method for negative error
    public static void negerror() {
        System.out.println(Divider);
        System.out.println("\n\tERROR: Please enter a POSITIVE number ABOVE 0\n");
    }

    //purpose ui
    public static void purpose() {
        System.out.println(Divider);
        System.out.println("This programs intended purpose is to calculate various attributes");
        System.out.println("of shapes utilizing specific measurements including: perimeter, area");
        System.out.println("surface area and volume. Please answer the questions prompted:");
        System.out.println("KURWA");
    }

    public static void main(String[] args) {

        //variables
        boolean loop; //NOTE: This variable is only used for loops and has no function (used system.exit instead)
        boolean havedata;
        boolean uierror;
        double shape_response;
        String response;
        String trash;

        //make objects
        Rectangle rectangle = new Rectangle();
        Parallelogram parallelogram = new Parallelogram();
        Triangle triangle = new Triangle();
        Trapezoid trapezoid = new Trapezoid();
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        Cube cube = new Cube();
        Cone cone = new Cone();
        SquareBasedPyramid squareBasedPyramid = new SquareBasedPyramid();
        RectangleBasedPrism rectangleBasedPrism = new RectangleBasedPrism();
        TriangleBasedPrism triangleBasedPrism = new TriangleBasedPrism();

        //make a scanner
        Scanner s = new Scanner(System.in);

//-----------------------------------------------------------------------------------------------------------------------

        purpose();

        //ask to solve shape
        do {
            loop = false;

            do {
                System.out.println(Divider);
                System.out.println("Would you like to solve a shape?");
                response = s.nextLine().toLowerCase(Locale.ROOT);
                if (response.equals("no")) {
                    System.out.println(Divider);
                    System.out.println("Have a good day :)");
                    System.exit(0);
                }
                if (response.equals("yes")) {
                    break;
                } else {
                    System.out.println(Divider);
                    System.out.println("\n\tERROR: Please answer \"yes\" or \"no\"\n");
                }
            } while (!loop);

            uierror = false;
            while (!uierror) {
                ui();
                response = s.nextLine().toLowerCase(Locale.ROOT);

//-----------------------------------------------------------------------------------------------------------------------

                //exit case
                switch (response) {
                    case "0": {
                        System.out.println(Divider);
                        System.out.println("Have a good day :)");
                        System.exit(0);
                    }

//------------------------------------------------------------------------------------------------------------------------

                    case "1": {

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the length");
                            if (s.hasNextDouble()) {
                                rectangle.setLength(s.nextDouble());
                                havedata = true;
                                if (rectangle.getLength() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the width");
                            if (s.hasNextDouble()) {
                                rectangle.setWidth(s.nextDouble());
                                havedata = true;
                                if (rectangle.getWidth() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        System.out.println(Divider);
                        rectangle.display();
                        uierror = true;
                        System.out.println("Perimeter: " + rectangle.calcPerimeter() + " cm" + "\nArea: " + rectangle.calcArea() + " cm^2");
                        s.nextLine();
                        break;
                    }

//------------------------------------------------------------------------------------------------------------------------------------------

                    case "2": {

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the base");
                            if (s.hasNextDouble()) {
                                parallelogram.setBase(s.nextDouble());
                                havedata = true;
                                if (parallelogram.getBase() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the second base");
                            if (s.hasNextDouble()) {
                                parallelogram.setSides(s.nextDouble());
                                havedata = true;
                                if (parallelogram.getSides() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the height");
                            if (s.hasNextDouble()) {
                                parallelogram.setHeight(s.nextDouble());
                                havedata = true;
                                if (parallelogram.getHeight() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        System.out.println(Divider);
                        parallelogram.display();
                        uierror = true;
                        System.out.println("Perimeter: " + parallelogram.calcPerimeter() + " cm" + "\nArea: " + parallelogram.calcArea() + " cm^2");
                        s.nextLine();
                        break;
                    }

//------------------------------------------------------------------------------------------------------------------------

                    case "3": {

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the base");
                            if (s.hasNextDouble()) {
                                triangle.setBase(s.nextDouble());
                                havedata = true;
                                if (triangle.getBase() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the first side");
                            if (s.hasNextDouble()) {
                                triangle.setSideone(s.nextDouble());
                                havedata = true;
                                if (triangle.getSideone() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the second side");
                            if (s.hasNextDouble()) {
                                triangle.setSidetwo(s.nextDouble());
                                havedata = true;
                                if (triangle.getSidetwo() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the height");
                            if (s.hasNextDouble()) {
                                triangle.setHeight(s.nextDouble());
                                havedata = true;
                                if (triangle.getHeight() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        System.out.println(Divider);
                        triangle.display();
                        uierror = true;
                        System.out.println("Perimeter: " + triangle.calcPerimeter() + " cm" + "\nArea: " + triangle.calcArea() + " cm^2");
                        s.nextLine();
                        break;
                    }

//----------------------------------------------------------------------------------------------------------------------

                    case "4": {

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the base");
                            if (s.hasNextDouble()) {
                                trapezoid.setBase(s.nextDouble());
                                havedata = true;
                                if (trapezoid.getBase() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the second base");
                            if (s.hasNextDouble()) {
                                trapezoid.setBasetwo(s.nextDouble());
                                havedata = true;
                                if (trapezoid.getBasetwo() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the first side");
                            if (s.hasNextDouble()) {
                                trapezoid.setSideone(s.nextDouble());
                                havedata = true;
                                if (trapezoid.getSideone() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the second side");
                            if (s.hasNextDouble()) {
                                trapezoid.setSidetwo(s.nextDouble());
                                havedata = true;
                                if (trapezoid.getSidetwo() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the height");
                            if (s.hasNextDouble()) {
                                trapezoid.setHeight(s.nextDouble());
                                havedata = true;
                                if (trapezoid.getHeight() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        System.out.println(Divider);
                        trapezoid.display();
                        uierror = true;
                        System.out.println("Perimeter: " + trapezoid.calcPerimeter() + " cm" + "\nArea: " + trapezoid.calcArea() + " cm^2");
                        s.nextLine();
                        break;
                    }

//------------------------------------------------------------------------------------------------------------------------

                    case "5": {
                        System.out.println(Divider);
                        System.out.println("Would you like to solve using\n1) Radius\n2) Diameter");
                        System.out.println(Divider);
                        response = s.next().toLowerCase(Locale.ROOT);
                        switch (response) {
                            case "1": {
                                do {
                                    havedata = false;
                                    System.out.println(Divider);
                                    System.out.println("Please enter the radius");
                                    if (s.hasNextDouble()) {
                                        circle.setRadius(s.nextDouble());
                                        havedata = true;
                                        if (circle.getRadius() <= 0) {
                                            negerror();
                                            havedata = false;
                                        }
                                    } else {
                                        error();
                                        trash = s.next();
                                    }
                                } while (!havedata);

                                System.out.println(Divider);
                                circle.radiusDisplay();
                                System.out.println("Circumference: " + circle.calcRadiusCircumference() + " cm" + "\nArea: " + circle.calcRadiusArea() + " cm^2");
                                s.nextLine();
                                break;
                            }


                            case "2": {
                                do {
                                    havedata = false;
                                    System.out.println(Divider);
                                    System.out.println("Please enter the diameter");
                                    if (s.hasNextDouble()) {
                                        circle.setDiameter(s.nextDouble());
                                        havedata = true;
                                        if (circle.getDiameter() <= 0) {
                                            negerror();
                                            havedata = false;
                                        }
                                    } else {
                                        error();
                                        trash = s.next();
                                    }
                                } while (!havedata);

                                System.out.println(Divider);
                                circle.diameterDisplay();
                                uierror = true;
                                System.out.println("Circumference: " + circle.calcDiameterCircumference() + " cm" + "\nArea: " + circle.calcDiameterArea() + " cm^2");
                                break;
                            }
                        }
                        break;
                    }

//------------------------------------------------------------------------------------------------------------------------

                    case "6": {

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the radius");
                            if (s.hasNextDouble()) {
                                cylinder.setRadius(s.nextDouble());
                                havedata = true;
                                if (cylinder.getRadius() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the height");
                            if (s.hasNextDouble()) {
                                cylinder.setHeight(s.nextDouble());
                                havedata = true;
                                if (cylinder.getHeight() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        System.out.println(Divider);
                        cylinder.display();
                        uierror = true;
                        System.out.println("Surface Area: " + cylinder.calcSurfaceArea() + " cm^2" + "\nVolume: " + cylinder.calcVolume() + " cm^3");
                        s.nextLine();
                        break;
                    }


//-------------------------------------------------------------------------------------------------------------------------
                    case "7": {

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the length");
                            if (s.hasNextDouble()) {
                                cube.setLength(s.nextDouble());
                                havedata = true;
                                if (cube.getLength() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        System.out.println(Divider);
                        cube.display();
                        uierror = true;
                        System.out.println("Surface Area: " + cube.calcSurfaceArea() + " cm^2" + "\nVolume: " + cube.calcVolume() + " cm^3");
                        s.nextLine();
                        break;
                    }

//-------------------------------------------------------------------------------------------------------------------------
                    case "8": {

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the radius");
                            if (s.hasNextDouble()) {
                                cone.setRadius(s.nextDouble());
                                havedata = true;
                                if (cone.getRadius() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the height");
                            if (s.hasNextDouble()) {
                                cone.setHeight(s.nextDouble());
                                havedata = true;
                                if (cone.getHeight() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the slant");
                            if (s.hasNextDouble()) {
                                cone.setSlant(s.nextDouble());
                                havedata = true;
                                if (cone.getSlant() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        System.out.println(Divider);
                        cone.display();
                        uierror = true;
                        System.out.println("Surface Area: " + cone.calcSurfaceArea() + " cm^2" + "\nVolume: " + cone.calcVolume() + " cm^3");
                        s.nextLine();
                        break;
                    }

                    //----------------------------------------------------------------------------------------------------------------------
                    case "9": {

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the base");
                            if (s.hasNextDouble()) {
                                squareBasedPyramid.setBase(s.nextDouble());
                                havedata = true;
                                if (squareBasedPyramid.getBase() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the triangle's height");
                            if (s.hasNextDouble()) {
                                squareBasedPyramid.setSlant(s.nextDouble());
                                havedata = true;
                                if (squareBasedPyramid.getSlant() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the pyramid's height");
                            if (s.hasNextDouble()) {
                                squareBasedPyramid.setHeight(s.nextDouble());
                                havedata = true;
                                if (squareBasedPyramid.getHeight() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        System.out.println(Divider);
                        squareBasedPyramid.display();
                        uierror = true;
                        System.out.println("Surface Area: " + squareBasedPyramid.calcSurfaceArea() + " cm^2" + "\nVolume: " + squareBasedPyramid.calcVolume() + " cm^3");
                        s.nextLine();
                        break;
                    }

//------------------------------------------------------------------------------------------------------------------------
                    case "10": {

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the length");
                            if (s.hasNextDouble()) {
                                rectangleBasedPrism.setLength(s.nextDouble());
                                havedata = true;
                                if (rectangleBasedPrism.getLength() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the width");
                            if (s.hasNextDouble()) {
                                rectangleBasedPrism.setWidth(s.nextDouble());
                                havedata = true;
                                if (rectangleBasedPrism.getWidth() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the height");
                            if (s.hasNextDouble()) {
                                rectangleBasedPrism.setHeight(s.nextDouble());
                                havedata = true;
                                if (rectangleBasedPrism.getHeight() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        System.out.println(Divider);
                        rectangleBasedPrism.display();
                        uierror = true;
                        System.out.println("Surface Area: " + rectangleBasedPrism.calcSurfaceArea() + " cm^2" + "\nVolume: " + rectangleBasedPrism.calcVolume() + " cm^3");
                        s.nextLine();
                        break;
                    }

//------------------------------------------------------------------------------------------------------------------------
                    case "11": {

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the base of the triangle");
                            if (s.hasNextDouble()) {
                                triangleBasedPrism.setBase(s.nextDouble());
                                havedata = true;
                                if (triangleBasedPrism.getBase() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the first side of the triangle");
                            if (s.hasNextDouble()) {
                                triangleBasedPrism.setSideone(s.nextDouble());
                                havedata = true;
                                if (triangleBasedPrism.getSideone() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the second side of the triangle");
                            if (s.hasNextDouble()) {
                                triangleBasedPrism.setSidetwo(s.nextDouble());
                                havedata = true;
                                if (triangleBasedPrism.getSidetwo() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the height of the triangle face");
                            if (s.hasNextDouble()) {
                                triangleBasedPrism.setTriangleheight(s.nextDouble());
                                havedata = true;
                                if (triangleBasedPrism.getTraingleheight() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        do {
                            havedata = false;
                            System.out.println(Divider);
                            System.out.println("Please enter the height of the prism");
                            if (s.hasNextDouble()) {
                                triangleBasedPrism.setPrismheight(s.nextDouble());
                                havedata = true;
                                if (triangleBasedPrism.getPrismheight() <= 0) {
                                    negerror();
                                    havedata = false;
                                }
                            } else {
                                error();
                                trash = s.next();
                            }
                        } while (!havedata);

                        System.out.println(Divider);
                        triangleBasedPrism.display();
                        uierror = true;
                        System.out.println("Surface Area: " + triangleBasedPrism.calcSurfaceArea() + " cm^2" + "\nVolume: " + triangleBasedPrism.calcVolume() + " cm^3");
                        s.nextLine();
                        break;
                    }

                    default: {
                        error();
                        break;
                    }
                }
            }

//-------------------------------------------------------------------------------------------------------------------------

        } while (!loop);
    }
}
