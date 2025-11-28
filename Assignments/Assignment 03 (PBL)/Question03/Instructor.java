package Question03;
import java.util.*;

public class Instructor {
    private int id;
    private String name;
    private String email;
    private List<Quiz> quizList;

    // constructor
    public Instructor(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
        quizList = new ArrayList<>();
    }

    // getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // method to find quiz 
    public Quiz findQuiz(int no){
        
        for(Quiz q : quizList){
            if(q.getQuizNo() == no){
                return q;
            }
        }

        return null;
    }

    // method to create quiz
    public void createQuiz(int no){
        
        // first verifying no quiz exists with the same number
        if(findQuiz(no) != null){
            System.out.println("Quiz already exist with same quiz no. Try anoher quiz no.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        // creating quiz
        Quiz quiz = new Quiz(no);

        System.out.print("How many questions you want to add? ");
        int noOfQUestions = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < noOfQUestions; i++){
            System.out.print("Enter question no " + (i+1) + ": ");
            String q = sc.nextLine();

            Question question = new Question(q);
            quiz.addQuestion(question);
        }

        quizList.add(quiz);
        System.out.println("Quiz added successfully!");

        // sc.close(); // closing scanner will not let you take input until the program runs
    }
   
}
