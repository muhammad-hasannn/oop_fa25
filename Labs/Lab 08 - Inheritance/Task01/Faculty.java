package Task01;
import java.util.List;
import java.util.ArrayList;

public class Faculty extends Employee{
    private int workHr;
    private List<Course> courses;

    // constructor
    public Faculty(int empNo, String name, String designation, String department, String email, int contact, double salary, int workHr){

        super(empNo, name, designation, department, email, contact, salary);

        this.workHr = workHr;

        courses = new ArrayList<>(); // array list of new courses got created
    }

    // method to assign course
    public void assignCourse(Course c){
        this.courses.add(c);
    }

    // toString method
    public String toString(){
        return super.toString() + " : " + workHr + " : " + courses;
    }

    // method to print course detail (useless but was asked in question)
    public void printDetail(){
        for(Course c : courses){
            System.out.println(c.getCode() + " | " + c.getName() + " | " + c.getCr());
        }
    }

}