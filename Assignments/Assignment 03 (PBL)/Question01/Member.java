package Question01;

import java.util.List;
import java.util.ArrayList;

public abstract class Member {
    private String id;
    private String name;
    private String email;
    protected List<Book> borrowedBooks; // protected because whenever a member will borrow book, this attribute will be used
    protected int borrowingPeriod = 0;

    // constructpr
    public Member(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        borrowedBooks = new ArrayList<>(); // an empty array list of borrowed books got created
    }

    // getters
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getBorrowingPeriod() {
        return borrowingPeriod;
    }

    // setters
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // this is abstract, because every member will have different limit
    public abstract boolean setBorrowingPeriod(int borrowingPeriod);

    // method to display all borrowed books
    public void displayBorrowedBooks() {
        if (borrowedBooks == null || borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed yet.");
            return;
        }

        System.out.println("\n----------- Borrowed Books -----------");
        System.out.println("Member: " + name + " (ID: " + id + ")");
        System.out.println("Borrowing Period: " + borrowingPeriod + " days");
        System.out.println("Total Books Borrowed: " + borrowedBooks.size());
        
        int i = 1;
        for (Book b : borrowedBooks) {
            System.out.println(i++ + ". " + b.getTitle() + " by " + b.getAuthor() + " (ID: " + b.getId() + ")");
        }
        System.out.println("------------------------------------------");
    }

    // as every member will have diff protocols to borrow a book
    public abstract boolean borrowBook(Book b);
    public abstract boolean returnBook(Book b);
}