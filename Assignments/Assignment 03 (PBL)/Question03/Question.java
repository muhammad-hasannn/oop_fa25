package Question03;

public class Question {
    private String question;

    // constructor
    public Question(String question) {
        this.question = question;
    }

    // getter and setter
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }

    // method to display question
    public void displayQuestion(){
        System.out.println(question);
    }
    
}
