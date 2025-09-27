/*
    Write a java program that gets input from a user into an array (six defined by user ) then find the max and min numbers found in array as well as the index at which they are found at. Then calculate the difference between two values and the difference between index as well. See screenshot for reference.
     HINT: use java.lang.Math.abs package to print absolute value between index differences to avoid negative value.
 */
package Tasks;
import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[6];

        for(int i = 0; i < 6; i++){
            System.out.print("Enter element no. " + (i+1) + ": ");
            n[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int minId = 0, maxId = 0;

        // finding max
        for(int i = 0; i < 6; i++){
            if(n[i] > max){
                max = n[i];
                maxId = i;
            }
        }

        // finding min
        for(int i = 0; i < 6; i++){
            if(n[i] < min){
                min = n[i];
                minId = i;
            }
        }

        System.out.println("Minimum value is: " + min + ". The index is: " + minId);
        System.out.println("Maximum value is: " + max + ". The index is: " + maxId);

        sc.close();
    }
}
