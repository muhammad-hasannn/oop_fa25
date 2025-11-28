package Question03;

public class Student {
    private int id;
    private String name;
    private String email;
    private Instructor instructor;

    // constructor
    public Student(int id, String name, String email, Instructor instructor){
        this.id = id;
        this.name = name;
        this.email = email;
        this.instructor = instructor;
    }

    // getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public Instructor geInstructor(){
        return instructor;
    }

    // setters
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setInstructor(Instructor instructor){
        this.instructor = instructor;
    }

    // method to attempt quiz    
    public void attemptQuiz(int no){
        // first, check if the quiz with this(passed) quiz no present in the student's instructor 
        Quiz quizToAttempt = instructor.findQuiz(no);

        if(quizToAttempt == null){
            System.out.println("Your instructor '" + instructor.getName() + "' has not created any quiz with this quiz nnumber.");
            return;
        }

        System.out.println("Here's your Quiz");
        quizToAttempt.displayQuiz();
    }
}
