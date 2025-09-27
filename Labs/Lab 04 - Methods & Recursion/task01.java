package Tasks;
import java.util.Scanner;

public class task01 {
    static int pNum = 0, pAge = 0, pContact = 0;
    static String pName, pComplain, pEmail;
    static float pBill;

    static void  getPatientInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter patient's number: ");
        pNum = sc.nextInt();
        sc.nextLine(); // flushing the leftover enter pressed by after entering number (nextInt() do not take enter)
        System.out.print("Enter patient's name: ");
        pName = sc.nextLine();
        System.out.print("Enter patient's age: ");
        pAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter patient's email: ");
        pEmail = sc.nextLine();
        System.out.print("Enter patient's contact number: ");
        pContact = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter patient's complain: ");
        pComplain = sc.nextLine();
        System.out.print("Enter patient's bill amount: ");
        pBill = sc.nextFloat();

        sc.close();
    }

    static void printInfo(){
        System.out.println();
        System.out.println("-----Patient's Receipt-----");

        System.out.println("Patient's number: " + pNum);
        System.out.println("patient's name: " + pName);
        System.out.println("Patient's age: " + pAge);
        System.out.println("Patient's email: " + pEmail);
        System.out.println("Patient's contact: " + pContact);
        System.out.println("Patient's complain: " + pComplain);
        System.out.println("Patient's bill: " + pBill);
    }

    public static void main(String[] args) {
        getPatientInfo();
        printInfo();
    }
}
