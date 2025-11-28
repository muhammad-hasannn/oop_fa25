package AbstractTask;

import Provided.Abstraction.Shape;

public class EquilateralTriangle extends Shape{
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return (1/4)*(Math.sqrt(3))*(Math.pow(side, 2));
    }

    @Override
    public double perimeter() {
        return (3*side);
    }
}
