package Task02;

public class Rectangle extends Shape {
    private int length;
    private int width;

    // constructor
    public Rectangle(Point p, int length, int width) {
        super(p);
        this.length = length;
        this.width = width;
    }

    // getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle[" + length + ", " + width + " " + super.toString() + "]";
    }

    @Override
    boolean contains(Point p) {
        // Calculate bounds of rectangle based on center point
        int halfLength = length / 2;
        int halfWidth = width / 2;

        int left = this.p.getX() - halfWidth;
        int right = this.p.getX() + halfWidth;
        int top = this.p.getY() + halfLength;
        int bottom = this.p.getY() - halfLength;

        // Check if point is within bounds
        return p.getX() >= left && p.getX() <= right && p.getY() >= bottom && p.getY() <= top;
    }
}