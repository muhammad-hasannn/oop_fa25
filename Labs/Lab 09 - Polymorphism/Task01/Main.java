package Task01;

public class Main {
    public static void main(String[] args) {
        
        // creating one of each type
        Employee e1 = new SalariedEmployee("Muhammad", "Hasan", "1234-56789", 1000.0);
        Employee e2 = new CommissionEmployee("Abdul", "Ghafoor", "9876-54321", 500, 0.10);
        Employee e3 = new BasePlusComissionEmployee("Ishtiaq", "Chandio", "4321-56789", 2000, 0.5, 2000);
        Employee e4 = new HourlyEmployee("Good", "Name", "56789-1234", 6, 50);

        System.out.println("\t\t***Details of all Employees***");
        
        /*
         * 1. displaying e1 
         */
        
        System.out.println("\n1. Employee 1: Salaried Employee");
        System.out.println("\tDetails: " + e1);
        System.out.println("\t" + "Earning: " + e1.earning()); // it will call the overridden earning() function

        /*
         * 2. displaying e2
         */
        System.out.println("\n2. Employee 2: Commission Employee");
        System.out.println("\tDetails: " + e2);
        System.out.println("\t" + "Earning: " + e2.earning());

        /*
         * 3. displaying e3
         */
        System.out.println("\n3. Employee 3: Base Plus Commission Employee");
        System.out.println("\tDetails: " + e3);
        System.out.println( "\n\t" + "Initial earning of third employee: " + e3.earning());

        // performing downcasting to access and set base salary
        // initially we created e2 with the reference of Emplyee
        BasePlusComissionEmployee currEmp = (BasePlusComissionEmployee)e3;

        // first getting old base salary of our down casted employee
        double oldBaseSalary = currEmp.getBaseSalary();
        System.out.println("\n\t" + "Old base salary: " + oldBaseSalary);

        currEmp.setBaseSalary(oldBaseSalary*1.10);
        System.out.println("\t" + "New base salary after increase: " + currEmp.getBaseSalary());

        // displaying earning
        System.out.println("\n\t" + "New earning of third Employee: " + e3.earning());

        /*
         * 4. displaying e4
         */
        System.out.println("\n4. Employee 4: Hourly Employee");
        System.out.println("\tDetails: " + e4);
        System.out.println("\t" + e4.earning());
    }
}
