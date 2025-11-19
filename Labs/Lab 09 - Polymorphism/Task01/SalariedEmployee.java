package Task01;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    // default constructor
    public SalariedEmployee(){}

    // parameterized constructor
    public SalariedEmployee(String firstName, String lastName, String cnic, double  weeklySalary){
        super(firstName, lastName, cnic);

        if(weeklySalary < 0){
            throw new IllegalArgumentException("Weekly salary cannot be negative.");
            // this will stop the program
        }
        this.weeklySalary = weeklySalary;
    }

    // getter
    public double getWeeklySalary(){
        return weeklySalary;
    }

    // setter
    public void setWeeklySalary(double weeklySalary){
        if(weeklySalary < 0){
            throw new IllegalArgumentException("Weekly salary cannot be negative.");    
        }
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString(){
        return "SalariedEmplyee[" + weeklySalary + " " + super.toString() + "]"; 
    }

    @Override
    public double earning(){
        return weeklySalary;
    }

}