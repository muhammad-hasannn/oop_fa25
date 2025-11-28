package Question01;

public class Librarian {
    private String id;
    private String name;
    private String email;
    private Library managedLibrary;

    // constructor
    public Librarian(String id, String name, String email, Library managedLibrary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.managedLibrary = managedLibrary;
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

    // method to add book
    public void addBook(Book b) {
        managedLibrary.addBook(b);
    }

    // method to add member
    public void addMember(Member m){
        managedLibrary.addMember(m);
    }

    // method to remove book
    public void removeBook(int id) {
        Book bookToRemove = managedLibrary.findBook(id);

        if (bookToRemove == null) {
            System.out.println("Book doesn't exist in library!");
            return;
        }

        managedLibrary.removeBook(bookToRemove);
        System.out.println("Book removed successfully from library!");
    }

    // method to issue book
    public void issueBook(String memberId, int bookId, int borrowTime) {

        // validating member
        Member member = managedLibrary.findMember(memberId);
        if (member == null) {
            System.out.println("Member doesn't exist.");
            return;
        }

        // validating book and it's availabilty
        Book book = managedLibrary.findBook(bookId);
        if (book == null || !(book.getAvailabilty())) {

            if(book == null){
                System.out.println("Book doesn't exist in library.");
            }
            else{
                System.out.println("Book is already borrowed by someone else.");
            }
            return;
        }
        
        /* now book and member is validated, book is also available. So issuing book */
        
        // validating borrowing period
        if(!(member.setBorrowingPeriod(borrowTime))){
            return; 
        }
        
        if (member.borrowBook(book)) { // true means book borrowed
            System.out.println("Book borrowed successfully!");
            book.setAvailability(false);
        }
        else{
            System.out.println("Not able to issue book.");
        }
        
        
        /*
         * Member member = managedLibrary.getMemberList().get(memberIndex);
         * Book book = managedLibrary.getBookList().get(bookIndex);
         * 
         * Problems:
         * 
         * You're accessing internal lists of Library through getters
         * This is called "breaking encapsulation" or "Law of Demeter violation"
         * Main shouldn't know Library has a "memberList" or "bookList"
         * Makes code fragile - if Library changes internal structure, this breaks
         * 
         * The rule: Don't chain more than 2 dots → object.method().method() is a code
         * smell
         * 
         * Law of demeter:
         * managedLibrary.getMemberList().get(index).borrowBook(book)
         *      ↓              ↓              ↓             ↓
         *    object       stranger1      stranger2     final method
         * 
         * Solution:
         * make proper methods to get member and book in library class
         */

    }

    // method to recive book
    public void reciveBook(String memberId, int bookId) {

        // validating member
        Member member = managedLibrary.findMember(memberId);
        if (member == null) {
            System.out.println("Member doesn't exists.");
            return;
        }

        // validating book and it's availabilty (was it actually borrowed?)
        Book book = managedLibrary.findBook(bookId);
        if (book == null || book.getAvailabilty()) {
            if(book == null){
                System.out.println("Book doesn't exist in library.");
            }
            else{
                System.out.println("Book wasn't borrowed.");
            }
            return;
        }

        // now book and member is validated, book is also available. So reciving book

        // setting borrowing period
        member.setBorrowingPeriod(0);

        if(member.returnBook(book)){
            System.out.println("Book recived successfully!");
            book.setAvailability(true);
        }
        else{
            System.out.println("Not able to recive book.");
        }

    }

    // method see borrwoing histroy
    public void seeBorrowingHistory(String id){
        
        // validating member
        Member member = managedLibrary.findMember(id);
        if (member == null) {
            System.out.println("Member doesn't exists.");
            return;
        }

        member.displayBorrowedBooks();
    }

}
