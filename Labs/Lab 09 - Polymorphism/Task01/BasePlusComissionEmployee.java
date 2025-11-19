package Task01;

public class BasePlusComissionEmployee extends CommissionEmployee{
    private double baseSalary;

    // default constructor
    public BasePlusComissionEmployee() { }

    // parameterized constructor
    public BasePlusComissionEmployee(String firstName, String lastName, String cnic, double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, cnic, grossSales, commissionRate);

        if(baseSalary < 0){
            throw new IllegalArgumentException("Base salary cannnot be negative.");
        }
        this.baseSalary = baseSalary;
    }

    // getter
    public double getBaseSalary(){
        return baseSalary;
    }

    // setter
    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0){
            throw new IllegalArgumentException("Base salary cannnot be negative.");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee [" + baseSalary + " " + super.toString() + "]";
    }

    @Override
    public double earning() {
        return baseSalary + super.earning();
    }
}
