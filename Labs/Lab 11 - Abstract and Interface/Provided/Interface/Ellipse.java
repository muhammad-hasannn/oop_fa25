package Provided.Interface;

import Provided.Abstraction.Shape;

public class Ellipse extends Shape implements Eccentric {
    private double a; // major radius
    private double b; // minor radius

    public Ellipse(double s1, double s2) {

        // whichever is greater assign it to a
        if (s1 < s2) {
            this.a = s2;
            this.b = s1;
        } else {
            this.a = s1;
            this.b = s2;
        }
    }

    @Override
    public double perimeter() {
        // Perimeter = P = π*2*underroot((a^2 + b^2) - ((a - b)^2)/2) [Note that if a =
        // b = r, then P = 2πr]
        // if a = b means it is circle

        if (a == b) {
            return 2 * Math.PI * a;
        }

        double sqrtPart = Math.sqrt((a * a + b * b) - Math.pow((a - b), 2) / 2);

        return Math.PI * 2 * sqrtPart;
    }

    @Override
    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public double eccentricuty() {
        // Eccentricity = e = 1 - (b^2)/(a^2)

        return 1 - (Math.pow(b, 2) / Math.pow(a, 2));
    }

    @Override
    public String toString() {
        return "\n" + name() +
                "\nArea = " + area() +
                "\nPerimeter = " + perimeter() +
                "\nEccentricity = " + eccentricuty();
    }

}
