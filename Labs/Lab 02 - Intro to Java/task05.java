/*
    pully
 */
package Tasks;
import java.util.Scanner;


public class task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter of 1st pully: ");
        float d1 = sc.nextFloat();
        System.out.print("Enter diameter of 2nd pully: ");
        float d2 = sc.nextFloat();
        System.out.print("Enter RPM (rotation per minute) of 1st pully: ");
        float rpm1 = sc.nextFloat();

        float rpm2 = (d1/d2)*rpm1;

        System.out.println("RPM of 2nd pully is: " + rpm2);
        sc.close();
    }
}
