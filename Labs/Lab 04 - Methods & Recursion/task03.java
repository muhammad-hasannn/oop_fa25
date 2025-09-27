package Tasks;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        // getting elements of 1st matrix
        System.out.println("Enter elements of Matrix 1");
        for(int i = 0; i < 3; i++){
            System.out.println("\tRow: " + (i+1));
            for(int j = 0; j < 3; j++){
                System.out.print("\t\tEnter value of coloumn " + (j+1) + ": ");
                m1[i][j] = sc.nextInt();
            }
        }

        // getting elements of 2nd matrix
        System.out.println();
        System.out.println("Enter elements of Matrix 2");
        for(int i = 0; i < 3; i++){
            System.out.println("\tRow: " + (i+1));
            for(int j = 0; j < 3; j++){
                System.out.print("\t\tEnter value of coloumn " + (j+1) + ": ");
                m2[i][j] = sc.nextInt();
            }
        }

        // displaying original matrices
        System.out.println();
        System.out.println("Original matrix 1:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Original matrix 2:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
