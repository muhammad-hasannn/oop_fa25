package Task;
import java.util.List;
import java.util.ArrayList;

public class Faculty {
    private int id;
    private String name;
    private String designation;
    private String email;
    private String contact;
    private int salary;
    private List<Course> c;

    // constructor
    public Faculty(int id, String name, String designation, String email, String contact, int salary){
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.email = email;
        this.contact = contact;
        this.salary = salary;
        this.c = new ArrayList<>(); // when a faculty will be created a list of courses for this faculty will created
    }

    // method to assign course
    public void assignCourse(Course c){
        this.c.add(c); // adding course to the list
    }

    public void displayInfo(){
        System.out.println( + id + " " + name + " " + designation + " " + email + " " + contact + " " + salary);
        System.out.println("\tCourses taught by: " + name);
        for(Course co : c){
            System.out.print("\t\t");
            co.displayInfo();
        }
    }
}