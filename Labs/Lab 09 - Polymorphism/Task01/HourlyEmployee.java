package Task01;

public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    // default constructor
    public HourlyEmployee() {
    }

    // parameterized constructor
    public HourlyEmployee(String firstName, String lastName, String cnic, double hours, double wage) {
        super(firstName, lastName, cnic);

        if (hours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative.");
        }
        this.hours = hours;

        if (wage < 0) {
            throw new IllegalArgumentException("Wage cannot be negative.");
        }
        this.wage = wage;
    }

    // getters
    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    // setters
    public void setHours(double hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative.");
        }
        this.hours = hours;
    }

    public void setWage(double wage) {
        if (wage < 0) {
            throw new IllegalArgumentException("Wage cannot be negative.");
        }
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee[" + hours + ", " + wage + " " + super.toString() + "]";
    }

    @Override
    public double earning() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }

}