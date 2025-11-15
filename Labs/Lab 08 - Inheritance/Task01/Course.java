package Task01;

public class Course {
    private String code;
    private String name;
    private int cr;

    // constructor
    public Course(String code, String name, int cr){
        this.code = code;
        this.name = name;
        this.cr = cr;
    }

    public String toString(){
        return code + " : " + name + " : " + cr;
    }

    // getters
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public int getCr(){
        return cr;
    }

    
}