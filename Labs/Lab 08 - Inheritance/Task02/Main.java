package Task02;

public class Main {
    public static void main(String[] args) {
        
        // three member classes
        Member m1 = new Member("Hasan", "hasan@gmail.com", "02-135251-040");
        Member m2 = new Member("Ghafoor", "ghafoor@gmail.com", "03-135251-040");
        Member m3 = new Member("Ishtiaq", "ishtiaq@gmail.com", "04-135251-040");

        // two members have current account
        CurrentAccount ca1 = new CurrentAccount(101, m1, "Thatta", 5000, "Current");
        CurrentAccount ca2 = new CurrentAccount(102, m3, "Badin", 2500, "Current");

        // one has saving
        SavingAccount sa1 = new SavingAccount(103, m2, "Narowal", 1000, "Saving");

        // displaying all information
        System.out.println("\n*****Accounts Information*****\n");
        ca1.displayInfo();
        System.out.println();
        ca2.displayInfo();
        System.out.println();
        sa1.displayInfo();
        

    }
}
