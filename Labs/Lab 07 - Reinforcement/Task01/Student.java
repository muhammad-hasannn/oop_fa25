package Task01;

public class Student {
    private String name;
    private int rollNo;
    private float[] marks = new float[3];

    // constructor
    public Student(String name, int rollNo, float[] marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // method to calculate average
    public float calAverage(){
        return ((marks[0] + marks[1] + marks[2])/3.0F);
    }

    // method to display info
    public void displayInfo(){
        System.out.print("Student name: " + name + " | Roll no. " + rollNo + " | Average: " + calAverage() + " | ");
        if(calAverage() >= 80.0){
            System.out.println("Grade A");
        }
        else if(calAverage() >= 60){
            System.out.println("Grade B");
        }
        else if(calAverage() >= 40){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }

}
