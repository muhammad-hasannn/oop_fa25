package Tasks;
import java.util.Scanner;

public class task04 {
    static int sum(int n){
        if(n == 0) return n;
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum of all numbers till " + n + " is: " + sum(n));
        sc.close();
    }
}
