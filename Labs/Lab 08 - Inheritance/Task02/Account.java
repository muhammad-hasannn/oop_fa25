package Task02;

public class Account {
    private int no;
    private Member owner;
    private String branch;
    private double balance;

    // constructor
    public Account(int no, Member owner, String branch, double balance){
        this.no = no;
        this.owner = owner;
        this.branch = branch;
        this.balance = balance;
    }

    // toString
    @Override
    public String toString() {
        return "Account [no=" + no + ", owner=" + owner + ", branch=" + branch + ", balance=" + balance + "]";
    }

    // getters
    public int getNo() {
        return no;
    }
    public Member getOwner() {
        return owner;
    }
    public String getBranch() {
        return branch;
    }
    public double getBalance() {
        return balance;
    }

}