package Provided.Abstraction;

public abstract class Shape {
    
    public String name(){
        return getClass().getName();
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return "\n" + name() + 
                "\nArea=" + area() + 
                "\nPerimeter=" + perimeter();
    }

}
