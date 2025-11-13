package Task03;
import java.util.Scanner;

public class Fibonacci {

    // method to calculate fibonacci number
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-2) + fib(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms you want in fibonacci sequence: ");
        int term = sc.nextInt();

        for(int i = 0; i < term; i++){
            System.out.print(fib(i) + " ");
        }

        sc.close();
    }
}
