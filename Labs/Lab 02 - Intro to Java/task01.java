/*
    area of rectangle
 */
package Tasks;
import java.util.Scanner;


public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height of rectangle: ");
        float height = sc.nextFloat();
        System.out.print("Enter width of rectangle: ");
        float width = sc.nextFloat();

        float area = (height*width);

        System.out.println("Area of rectangle is: " + area);

        sc.close();
    }
}
