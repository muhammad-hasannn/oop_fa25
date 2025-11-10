package Task02;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Good Book", "Muhammad Hasan");
        Book b2 = new Book(102, "Bad Book", "Ghafoor");
        Book b3 = new Book(103, "Excellent Book", "Osama bin Ladin");

        Library l1 = new Library(1, "First Library");
        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);

        Librarian librarian1 = new Librarian(202, "Ishtiaq", l1);

        librarian1.displayInfo();

    }
}
