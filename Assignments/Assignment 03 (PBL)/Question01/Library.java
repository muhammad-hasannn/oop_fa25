package Question01;
import java.util.*;

public class Library {
    private String name;
    private List<Book> books;
    private List<Member> members;

    // constructor
    public Library(String name){
        this.name = name;
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // getter    
    public String getName() {
        return name;
    }
    
    // setter
    public void setName(String name) {
        this.name = name;
    }

    // method to search book (helper method for finding book)
    public int searchBook(int id){
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getId() == id){
                return i; // returning the index
            }
        }
        return -1;
    }

    // find book
    public Book findBook(int id){
        int bookIndex = searchBook(id);
        
        // means no book in list with this id
        if(bookIndex == -1){
            return null;
        }

        return books.get(bookIndex);
    }

    // method to search member (helper method for finding member)
    public int searchMember(String id){
        for(int i = 0; i < members.size(); i++){
            if(members.get(i).getId().equals(id)){
                return i; // returning the index
            }
        }

        return -1;
    }

    // find member
    public Member findMember(String id){
        int memberIndex = searchMember(id);
        
        if(memberIndex == -1){
            return null;
        }

        return members.get(memberIndex);
    }


    /* all variables will be passed after verification in librarian */
    // method to add books
    public void addBook(Book b){
        books.add(b);
    }

    // method to remove books
    public void removeBook(Book b){
        int bookIndex = searchBook(b.getId());

        books.remove(bookIndex);
    }

    // method to add members
    public void addMember(Member m){
        members.add(m);
    }
}
