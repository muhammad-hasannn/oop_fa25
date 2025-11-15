package Task01;

public class Employee {
    private int empNo;
    private String name;
    private String designation;
    private String department;
    private String email;
    private int contact;
    private double salary;

    // constructor
    public Employee(int empNo, String name, String designation, String departement, String email, int contact, double salary){
        this.empNo = empNo;
        this.name = name;
        this.designation = designation;
        this.department = departement;
        this.email = email;
        this.contact = contact;
        this.salary = salary;
    }

    // method to represent object textually
    public String toString(){
        return empNo + " : " + name + " : " + designation + " : " + department + " : " + email + " : " + contact + " : " + salary;
    }
}