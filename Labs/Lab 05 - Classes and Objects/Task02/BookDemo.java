/*
Write a Java class Book with following features:
    •	Instance variables :
            o	title for the title of book of type String.
            o	author for the author’s name of type String.
            o	price for the book price of type double.
    •	Constructor:
            o	public Book (String title, String name, double price)
    •	Instance methods:
            o	public void setTitle(String title): Used to set the title of book.
            o	public void setAuthor(String author): Used to set the name of author of book.
            o	public void setPrice(double price): Used to set the price of book.
            o	public double getTitle(): This method returns the title of book.
            o	public double getAuthor(): This method returns the author’s name of book.
            o	public String printInfo(): This method printed out book’s details to the screen.
Write a separate class BookDemo with a main() method creates a Book titled “Developing Java Software” with authors Russel Winderand price 79.75. Prints the Book’s string representation to standard output (using System.out.println).
*/


package Task02;

public class BookDemo {
    public static void main(String[] args) {
        Book b = new Book("Developing Java", "Muhammad Hasan", 79.5);

        b.printInfo();
    }
}
