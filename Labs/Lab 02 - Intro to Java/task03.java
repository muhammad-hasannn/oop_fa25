/*
    arithmetic operations
 */
package Tasks;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println();
        System.out.println("Sum is: " + (a+b));
        System.out.println("Product is: " + (a*b));
        System.out.println("Difference is: " + (a-b));

        sc.close();
    }
}
