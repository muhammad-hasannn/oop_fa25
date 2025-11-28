package Question01;

public class Faculty extends Member{
    private final int MAX_BORROW_PERIOD = 10;
    private final int MAX_BORROW_BOOKS = 5;
    
    
    // constructor
    public Faculty(String id, String name, String email) {
        super(id, name, email);
    }

    // getters
    public int getMAX_BORROW_PERIOD() {
        return MAX_BORROW_PERIOD;
    }
    public int getMAX_BORROW_BOOKS() {
        return MAX_BORROW_BOOKS;
    }
    
    // setters
    @Override
    public boolean setBorrowingPeriod(int borrowingPeriod) {
        if(borrowingPeriod > MAX_BORROW_PERIOD){
            System.out.println("Borrowing period can't be that high.");
            return false;
        }
        
        this.borrowingPeriod = borrowingPeriod;
        return true;
    }

    @Override
    // here book will be passed after verfication that is it present in library or not
    public boolean borrowBook(Book b) {
        if(borrowedBooks.size() >= MAX_BORROW_BOOKS){
            System.out.println("Max limit of borrowing books reached.");
            return false;
        }

        borrowedBooks.add(b);
        return true;
    }

    @Override
    public boolean returnBook(Book b) {
        
        // verifying that if user has actually borrowed that book
        for(int i = 0; i < borrowedBooks.size(); i++){
            if(borrowedBooks.get(i).getId() == b.getId()){
                return true;
            }
        }

        return false;
    }
    
}