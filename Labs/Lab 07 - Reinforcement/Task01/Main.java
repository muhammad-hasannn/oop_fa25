package Task01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array of three students
        Student[] stu = new Student[3];

        // getting input
        for(int i = 0; i < 3; i++){
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll no: ");
            int rollNo = sc.nextInt();

            float[] marks = new float[3];

            for(int j = 0; j < 3; j++){
                System.out.print("Enter marks in course no. " + (j+1) + ": ");
                marks[j] = sc.nextFloat();
            }
            sc.nextLine();
            System.out.println();

            // making object
            stu[i] = new Student(name, rollNo, marks);

        }

        // displaying info
        System.out.println();
        for(int i = 0; i < 3; i++){
            stu[i].displayInfo();
        }

        sc.close();
    }
}