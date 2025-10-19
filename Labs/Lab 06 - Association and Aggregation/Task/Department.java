package Task;

import java.util.List;
import java.util.ArrayList;

public class Department {
    private String name;
    private List<Faculty> f;

    // constructor
    public Department(String name){
        this.name = name;
        this.f = new ArrayList<>(); // a new list of faculty
    }

    // add faculty
    public void  addFaculty(Faculty f){
        this.f.add(f);
    }

    public void displayInfo(){
        System.out.println("Department name: " + name);

        System.out.println("List of faculty: ");
        for(Faculty fa : f){
            fa.displayInfo();
        }
    }
}