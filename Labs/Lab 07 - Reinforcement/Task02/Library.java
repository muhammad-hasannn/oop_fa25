package Task02;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private int libNo;
    private String libName;
    private List<Book> books;

    // constructor
    public Library(int libNo, String libName){
        this.libNo = libNo;
        this.libName = libName;
        this.books = new ArrayList<>();
    }

    // method to add new books
    public void addBook(Book b){
        books.add(b);
    }

    // to display books
    public void displayInfo(){
        for(int i = 0; i < books.size(); i++){
            books.get(i).displayInfo();
        }
    }

}
