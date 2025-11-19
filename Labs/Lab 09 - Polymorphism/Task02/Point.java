package Task02;

public class Point {
    private int x;
    private int y;

    // constructor
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // getters
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    @Override
    public String toString(){
        return "Point[" + x + ", " + y + "]";
    }

    public double distanceTo(Point p){
        return Math.sqrt( (x-p.getX())*(x-p.getX()) + (y-p.getY())*(y-p.getY()) );
    }
}