package Task02;

public class Book {
    private String title;
    private String author;
    private double price;

    // constructor
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // getters
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }

    // method to print info
    public void printInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}