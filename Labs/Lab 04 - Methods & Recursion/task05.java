package Tasks;
import java.util.Scanner;

public class task05 {


    static int middleNumsSum(int start, int end){
        if(start == end) return start;
        return start+middleNumsSum(start+1, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("Sum of all numbers between " + start + " and " + end +" is: " + middleNumsSum(start, end));

        sc.close();
    }
}
