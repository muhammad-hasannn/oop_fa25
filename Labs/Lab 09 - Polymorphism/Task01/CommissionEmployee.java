package Task01;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    // default constructor
    public CommissionEmployee() {
    }

    // parameterized constructor
    public CommissionEmployee(String firstName, String lastName, String cnic, double grossSales, double commissionRate) {
        super(firstName, lastName, cnic);

        if (grossSales < 0) {
            throw new IllegalArgumentException("Gross sales cannot be negative");
        }
        this.grossSales = grossSales;

        if (commissionRate < 0) {
            throw new IllegalArgumentException("Commission rate cannot be negative");
        }
        this.commissionRate = commissionRate;
    }

    // getters
    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    // setters
    public void setGrossSales(double grossSales) {
        if (grossSales < 0) {
            throw new IllegalArgumentException("Gross sales cannot be negative");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0) {
            throw new IllegalArgumentException("Commission rate cannot be negative");
        }
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee [" + grossSales + ", " + commissionRate + " " + super.toString() + "]";
    }

    @Override
    public double earning() {
        return grossSales * commissionRate;
    }

}
