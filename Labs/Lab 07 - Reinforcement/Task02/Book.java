package Task02;

public class Book {
    private int bookId;
    private String title;
    private String author;

    // constructor
    public Book(int bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // method to display info
    public void displayInfo(){
        System.out.println("Id: " + bookId + " | Title: " + title + " | Author: " + author);
    }


}
