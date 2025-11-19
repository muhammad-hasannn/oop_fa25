package Task02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create ShapeArray object with size = 20
        ShapeArray shapeArray = new ShapeArray(20);

        
        int choice = 0;

        do {
            System.out.println("\n\t---MENU---");
            System.out.println("1. Add new shape.");
            System.out.println("2. Display the average of all rectangle's area.");
            System.out.println("3. Display the number of circles.");
            System.out.println("4. Remove all rectangles.");
            System.out.println("5. Exit.");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            System.out.println();

            if(choice == 1){
                int choice1 = 0;

                do {
                    System.out.println("\n\t\t---Add Shape---");
                    System.out.println("\t1. Rectangle.");
                    System.out.println("\t2. Circle.");
                    System.out.println("\t3. Exit.");
                    System.out.print("\tEnter choice: ");
                    choice1 = sc.nextInt();
                    System.out.println();

                    // for rectangle
                    if(choice1 == 1){
                        System.out.print("\tEnter x: ");
                        int x = sc.nextInt();
                        System.out.print("\tEnter y: ");
                        int y = sc.nextInt();

                        // creating point 
                        Point point = new Point(x, y);

                        System.out.print("\tEnter length: ");
                        int length = sc.nextInt();
                        System.out.print("\tEnter Width: ");
                        int width = sc.nextInt();

                        // creating rectangle
                        Rectangle rectangle = new Rectangle(point, length, width);

                        // adding it into shapeArray
                        if(shapeArray.addShape(rectangle)){
                            System.out.println("\n\tRectangle added!");
                        }
                        else System.out.println("\n\tShape not added.");
                        
                    }

                    // for circle
                    else if(choice1 == 2){
                        System.out.print("\tEnter x: ");
                        int x = sc.nextInt();
                        System.out.print("\tEnter y: ");
                        int y = sc.nextInt();

                        // creating point 
                        Point point = new Point(x, y);

                        System.out.print("\tEnter radius: ");
                        int radius = sc.nextInt();

                        Circle circle = new Circle(point, radius);
                        if(shapeArray.addShape(circle)){
                            System.out.println("\n\tCircle added!");
                        }
                        else System.out.println("\n\tCircle not added.");
                    }

                    // exit
                    else if(choice1 == 3) System.out.println("\tExiting...");
                    else System.out.println("\tInvalid choice.");
                    
                } while (choice1 != 3);

            }

            // choice 2 -> average of all rectangles area
            else if(choice == 2){
                System.out.println("Average of all rectangle's area is: " + shapeArray.getAvgRectArea());
            }

            // choice 3 ->  no of all circles
            else if(choice == 3){
                System.out.println("Total no of all circles is: " + shapeArray.getCircleCounter());
            }

            // choice 4 -> remove all rectangles
            else if(choice == 4){
                shapeArray.removeAllRect();
                System.out.println("All rectangles removed.");
            }

            // choice 5 -> exit
            else if(choice == 5) System.out.println("Exiting program.");

            else System.out.println("Invalid choice.");
            
        } while (choice != 5);

        sc.close();
    }
}