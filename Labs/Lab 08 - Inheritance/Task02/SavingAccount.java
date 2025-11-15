package Task02;

public class SavingAccount extends Account{
    private String type;

    // constructor
    public SavingAccount(int no, Member owner, String branch, double balance, String type) {
        super(no, owner, branch, balance);
        this.type = type;
    }

    // getter
    public String getType(){
        return type;
    }

    // toString
    @Override
    public String toString() {
        return "SavingAccount [type=" + type + ", toString()=" + super.toString() + "]";
    }
    
    // method to display info
    public void displayInfo() {
        System.out.println("----- Saving Account Details -----");
        System.out.println("Account Number : " + getNo());
        System.out.println("Owner Name     : " + getOwner().getName());
        System.out.println("Owner Email    : " + getOwner().getEmail());
        System.out.println("Owner Contact  : " + getOwner().getContact());
        System.out.println("Branch         : " + getBranch());
        System.out.println("Balance        : " + getBalance());
        System.out.println("Account Type   : " + type);
        System.out.println("----------------------------------");
    }

    
}