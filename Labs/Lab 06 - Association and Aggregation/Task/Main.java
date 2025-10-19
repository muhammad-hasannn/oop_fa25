/*
Create Driver class named as Association_aggregation_1. Create proper Objects of all classes as follows
    •	2 Objects of Course class
    •	3 Objects of Faculty class
    •	3 Objects of Department Class
And properly display all the information
*/

package Task;

public class Main {

    public static void main(String[] args) {

        //1. two objects of Course class
        Course c1 = new Course("CSC101", "CP", "4");
        Course c2 = new Course("CSC102", "OOP", "3");

        //2. three objects of faculty class
        Faculty f1 = new Faculty(10, "Hasan", "HOD", "h@gmail.com", "404", 10000);
        Faculty f2 = new Faculty(11, "Ghafoor", "Dean", "g@gmail.com", "405", 20000);
        Faculty f3 = new Faculty(12, "Ishtiaq", "Cluster Head", "i@gmail.com", "406", 30000);

        /*
        assigning course to faculty
            - hasan will be teaching c1 & c2
            - ghafoor will be teaching c1
            - ishtiaq will not be teaching ant course
         */
        f1.assignCourse(c1);
        f1.assignCourse(c2);

        f2.assignCourse(c1);

        //3. three objects of department
        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Social Sciences");
        Department d3 = new Department("Management Studies");

        /*
        assigning faculty to department
            - d1 will have f1, f2 & f3
            - d2 will have f1 & f2
            - d3 will have f1
         */
        d1.addFaculty(f1);
        d1.addFaculty(f2);
        d1.addFaculty(f3);

        d2.addFaculty(f1);
        d2.addFaculty(f2);

        d3.addFaculty(f1);


        // printing all of the things
        System.out.println("----------------------------------------");
        System.out.println("            University Data             ");
        System.out.println("----------------------------------------\n");


        System.out.println("*****************************************");
        System.out.println("1. List of All Courses");
        System.out.println("----------------------------------------");
        c1.displayInfo();
        c2.displayInfo();
        System.out.println("*****************************************\n");

        System.out.println("*****************************************");
        System.out.println("2. List of All Faculty Members");
        System.out.println("----------------------------------------");
        f1.displayInfo();
        System.out.println("----------------------------------------");
        f2.displayInfo();
        System.out.println("----------------------------------------");
        f3.displayInfo();
        System.out.println("*****************************************\n");

        System.out.println("*****************************************");
        System.out.println("3. List of All Departments");
        System.out.println("----------------------------------------");
        d1.displayInfo();
        System.out.println("----------------------------------------");
        d2.displayInfo();
        System.out.println("----------------------------------------");
        d3.displayInfo();
        System.out.println("*****************************************\n");
    }
}