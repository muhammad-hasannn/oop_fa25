package Task02;

public class Circle extends Shape{
    private int radius;

    // constructor
    public Circle(Point p, int radius){
        super(p);
        this.radius = radius;
    }

    // getter 
    public int getRadius(){
        return radius;
    }

    @Override
    public String toString() {
        return "Circle [" + radius + " " + super.toString() + "]";
    }

    @Override
    boolean contains(Point p) {
        // Point is inside circle if distance from center <= radius
        double distance = this.p.distanceTo(p);
        return distance <= radius;
    }
}