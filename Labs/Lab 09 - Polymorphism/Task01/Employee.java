package Task01;

public class Employee {
    private String firstName;
    private String lastName;
    private String cnic;
    
    // default constructor
    public Employee(){}

    // parameterized constructor
    public Employee(String firstName, String lastName, String cnic){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnic = cnic;
    }

    // getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getCnic() {
        return cnic;
    }
    
    // setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setCnic(String cnic){
        this.cnic = cnic;
    }

    @Override
    public String toString(){
        return "Employee[" + firstName + ", " + lastName + ", " + cnic + "]";
    }

    public double earning(){
        return 0.00;
    }

}