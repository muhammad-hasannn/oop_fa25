/*
    Celsius to fahrenheit converter
 */
package Tasks;
import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius*(9/5.00) + 32);

        System.out.println(celsius + "in fahrenheit is: " + fahrenheit);

        sc.close();
    }
}
