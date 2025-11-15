package Task01;

public class Main {
    public static void main(String[] args) {
        // 1. two objects of staff class
        Staff s1 = new Staff(1, "Hasan", "HoD", "CS", "hasan@gmail.com", 12345, 10000000, 6);
        Staff s2 = new Staff(2, "Ghafoor", "DG", "SS", "ghafoor@gmail.com", 98765, 1000000, 5);

        // 2. two object of faculty class
        Faculty f1 = new Faculty(3, "Ishtiaq", "Sr. Professor", "CS", "ishtiaq@gmail.com", 12345, 20000, 6);
        Faculty f2 = new Faculty(4, "Shabbir", "Assistant", "CS", "shabbir@gmail.com", 7878, 30000, 7);

        // 3. three objects of courses
        Course c1 = new Course("CS101", "DSA", 4);
        Course c2 = new Course("CS102", "OOP", 3);
        Course c3 = new Course("CE103", "CCN", 4);

        // assigning course to faculty
        f1.assignCourse(c1);
        f1.assignCourse(c2);
        f1.assignCourse(c3);

        f2.assignCourse(c3);


        // displaying all information
        System.out.println("\t\t\t---All Data--- ");

        System.out.println("\n1. Staff Members");
        System.out.println("\t" + s1);
        System.out.println("\t" + s2 + "\n");

        System.out.println("\n2. Faculty Members");
        System.out.println("\t" + f1);
        System.out.println("\t" + f2 + "\n");

    }
}
