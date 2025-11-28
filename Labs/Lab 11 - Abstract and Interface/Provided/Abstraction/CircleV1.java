/*
Version 1: when circle extends Shape
*/


package Provided.Abstraction;

public class CircleV1 extends Shape {
    private double radius;

    public CircleV1(double r){
		radius = r;
    }
    
    // getter
    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * (radius * radius);
    }

    public double perimeter() {
        return 2.0 * Math.PI * radius;
    }


}
