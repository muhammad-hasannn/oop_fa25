package Question03;
import java.util.*;

public class Quiz {
    private int quizNo;
    private List<Question> questionList;

    // constructor
    public Quiz(int quizNo){
        this.quizNo = quizNo;
        questionList = new ArrayList<>();
    }

    // getter
    public int getQuizNo() {
        return quizNo;
    }
    public List<Question> getQuestionList() {
        return questionList;
    }
    
    // setter
    public void setQuizNo(int quizNo) {
        this.quizNo = quizNo;
    }

    // method to add quiz
    public void addQuestion(Question q){
        questionList.add(q);
    }

    // method to display quiz
    public void displayQuiz(){

        int i = 1;

        System.out.println();
        for(Question q : questionList){
            System.out.print(i + ". ");
            q.displayQuestion();
            i++;
        }
    }

        
}
