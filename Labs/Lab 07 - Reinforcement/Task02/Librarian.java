package Task02;

public class Librarian {
    private int id;
    private String name;
    private Library lib;

    // constructor
    public Librarian(int id, String name, Library lib){
        this.id = id;
        this.name = name;
        this.lib = lib;
    }

    // method to display info
    public void displayInfo(){
        lib.displayInfo();

    }

}
