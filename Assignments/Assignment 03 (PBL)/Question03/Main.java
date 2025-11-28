package Question03;

public class Main{

    public static void  main(String[] args) {
        // Setup instructors and students
        Instructor i1 = new Instructor(1111, "Hasan", "hasan@gmail.com");
        Instructor i3 = new Instructor(3333, "Daniyal", "daniyal@gmail.com");
    
        Student s1 = new Student(9999, "Arham", "arham@gmail.com", i1);
        Student s5 = new Student(5555, "Yasir", "yasir@gmail.com", i3);
    
        // Test 1: Create a quiz
        System.out.println("--- TEST 1: Creating Quiz ---");
        i1.createQuiz(10);
        
        // Test 2: Verify duplicate prevention
        System.out.println("\n--- TEST 2: Duplicate Quiz Number ---");
        i1.createQuiz(10);
        
        // Test 3: Student attempts quiz
        System.out.println("\n--- TEST 3: Attempting Quiz ---");
        s1.attemptQuiz(10);
        
        // Test 4: Quiz doesn't exist
        System.out.println("\n--- TEST 4: Non-existent Quiz ---");
        s5.attemptQuiz(89);

        
    }
}
