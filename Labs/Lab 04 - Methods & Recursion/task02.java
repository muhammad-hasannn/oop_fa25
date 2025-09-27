package Tasks;
import java.util.Scanner;

public class task02 {
    public static int computePrimeSum(int n){
         int sum = 0;

        for(int i = 1; i < n; i++){
            int count = 0;

            // checking if it is prime or not
            for(int j = 1; j <= i; j++){
                if(i % j == 0)  count++;
            }

            if(count == 2) sum += i;
        }

        return sum;

    }

    public static int computeEvenSum(int n){
        int sum = 0;

        for(int i = 1; i < n; i++){
            if(i % 2 == 0) sum += i;
        }
        return sum;
    }

    public static int computeOddSum(int n){
        int sum = 0;

        for(int i = 1; i < n; i++){
            if(!(i % 2 == 0)) sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        while(n >= 0){
            System.out.print("Enter a number (negative to quit): ");
            n = sc.nextInt();

            if(n < 0){
                System.out.println("You entered a negative number. Quiting.");
                continue;
            }

            System.out.println("Sum of all prime numbers less than " + n + " is: " + computePrimeSum(n));
            System.out.println("Sum of all even numbers less than " + n + " is: " + computeEvenSum(n));
            System.out.println("Sum of all odd numbers less than " + n + " is: " + computeOddSum(n));
        }

        sc.close();
    }
}
