package Question01;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean availability;
    
    // constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.availability = true;
    }

    // getters
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean getAvailabilty() {
        return availability;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
   
}