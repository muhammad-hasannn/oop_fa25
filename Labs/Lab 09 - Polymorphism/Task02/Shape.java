package Task02;

abstract public class Shape {
    protected Point p;

    // constructor
    public Shape(Point p){
        this.p = p;
    }

    // getter
    public Point getCenter(){
        return p;
    }

    @Override
    public String toString(){
        return "Shape [" + p + "]";
    }

    // this method will be implemented by sub classes
    abstract boolean contains(Point p);
    
}
