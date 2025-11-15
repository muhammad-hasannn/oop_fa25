package Task01;

public class Staff extends Employee {
    private int workHr;

    // constructor
    public Staff(int empNo, String name, String designation, String departement, String email, int contact, double salary, int workHr){

        // explicitly giving parameters to super() method to call constructor of parent class
        super(empNo, name, designation, departement, email, contact, salary);

        this.workHr = workHr;
    }

    public String toString(){
        return super.toString() + " : " + workHr;
    }   
    
}