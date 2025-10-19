package Task;

public class Course {
    private String code;
    private String name;
    private String cr;

    // constructor
    public Course(String code, String name, String cr){
        this.code = code;
        this.name = name;
        this.cr = cr;
    }

    // getters
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public String getCr(){
        return cr;
    }

    public void displayInfo(){
        System.out.println("\t" + code + " " + name + " " + cr);
    }
}