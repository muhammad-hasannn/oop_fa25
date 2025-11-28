package Question01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Add Librarian
        System.out.println("****************************************");
        System.out.println("    SMART LIBRARY MANAGEMENT SYSTEM    ");
        System.out.println("****************************************\n");

        System.out.println("----------- ADD LIBRARY -----------");
        System.out.print("Enter Library Name: ");
        String libraryName = sc.nextLine();
        
        Library library = new Library(libraryName);

        System.out.println("\nLibrary added successfully!");
        System.out.println("****************************************\n");
        

        System.out.println("----------- ADD LIBRARIAN -----------");
        System.out.print("Enter Librarian ID: ");
        String libId = sc.nextLine();
        System.out.print("Enter Librarian Name: ");
        String libName = sc.nextLine();       
        System.out.print("Enter Librarian Email: ");
        String libEmail = sc.nextLine();        
        
        Librarian librarian = new Librarian(libId, libName, libEmail, library);
        
        System.out.println("\nLibrarian added successfully!");
        System.out.println("****************************************\n");
        
        // Step 2: Add Books
        String choice;
        do {
            System.out.println("----------- ADD BOOK -----------");
            System.out.print("Enter Book ID: ");
            int bookId = sc.nextInt();
            sc.nextLine(); // consume newline
            
            System.out.print("Enter Book Title: ");
            String bookTitle = sc.nextLine();
            
            System.out.print("Enter Book Author: ");
            String bookAuthor = sc.nextLine();
            
            Book book = new Book(bookId, bookTitle, bookAuthor);
            librarian.addBook(book);
            
            System.out.println("Book added successfully!");
            
            System.out.print("\nDo you want to add more books? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
            
        } while (choice.equalsIgnoreCase("y"));
        
        System.out.println("****************************************\n");
        
        // Step 3: Add Members
        do {
            System.out.println("----------- ADD MEMBER -----------");
            System.out.println("Select Member Type:");
            System.out.println("1. Student");
            System.out.println("2. Faculty");
            System.out.print("Enter choice: ");
            int memberType = sc.nextInt();
            sc.nextLine(); // consume newline
            
            System.out.print("Enter Member ID: ");
            String memberId = sc.nextLine();            
            System.out.print("Enter Member Name: ");
            String memberName = sc.nextLine();            
            System.out.print("Enter Member Email: ");
            String memberEmail = sc.nextLine();
            
            Member member;
            if (memberType == 1) {
                member = new Student(memberId, memberName, memberEmail);
            }
            else if (memberType == 2) {
                member = new Faculty(memberId, memberName, memberEmail);
            }
            else {
                System.out.println("Invalid choice!");
                System.out.println();
                continue;
            }
            
            librarian.addMember(member);
            System.out.println("Member added successfully!");
            
            System.out.print("\nDo you want to add more members? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
            
        } while (choice.equalsIgnoreCase("y"));
        
        System.out.println("****************************************\n");
        
        // Main Menu
        int menuChoice;
        do {
            System.out.println("\n========== LIBRARY MENU ==========");
            System.out.println("1. Add member");
            System.out.println("2. Add book");
            System.out.println("3. Remove book");
            System.out.println("4. Issue book");
            System.out.println("5. Receive book");
            System.out.println("6. See borrowing history");
            System.out.println("7. Exit");
            System.out.println("==================================");
            System.out.print("Enter your choice: ");
            menuChoice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            switch (menuChoice) {
                case 1: // Add member
                    System.out.println("\n----------- ADD MEMBER -----------");
                    System.out.println("Select Member Type:");
                    System.out.println("1. Student");
                    System.out.println("2. Faculty");
                    System.out.print("Enter choice: ");
                    int type = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Enter Member ID: ");
                    String mId = sc.nextLine();                    
                    System.out.print("Enter Member Name: ");
                    String mName = sc.nextLine();                    
                    System.out.print("Enter Member Email: ");
                    String mEmail = sc.nextLine();
                    
                    if (type == 1) {
                        librarian.addMember(new Student(mId, mName, mEmail));
                    }
                    else if (type == 2) {
                        librarian.addMember(new Student(mId, mName, mEmail));
                    }
                    else {
                        System.out.println("Invalid choice!");
                        break;
                    }
                    System.out.println("Member added successfully!");
                    break;
                    
                case 2: // Add book
                    System.out.println("\n----------- ADD BOOK -----------");
                    System.out.print("Enter Book ID: ");
                    int bId = sc.nextInt();
                    sc.nextLine();                    
                    System.out.print("Enter Book Title: ");
                    String bTitle = sc.nextLine();                    
                    System.out.print("Enter Book Author: ");
                    String bAuthor = sc.nextLine();

                    librarian.addBook(new Book(bId, bTitle, bAuthor));
                    System.out.println("Book added successfully!");
                    break;
                    
                case 3: // Remove book
                    System.out.println("\n----------- REMOVE BOOK -----------");
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = sc.nextInt();
                    sc.nextLine();
                    
                    librarian.removeBook(removeId);
                    break;
                    
                case 4: // Issue book
                    System.out.println("\n----------- ISSUE BOOK -----------");
                    System.out.print("Enter Member ID: ");
                    String issueMemberId = sc.nextLine();                    
                    System.out.print("Enter Book ID: ");
                    int issueBookId = sc.nextInt();                    
                    System.out.print("Enter Borrowing Period (days): ");
                    int borrowPeriod = sc.nextInt();
                    sc.nextLine();
                    
                    librarian.issueBook(issueMemberId, issueBookId, borrowPeriod);
                    break;
                    
                case 5: // Receive book
                    System.out.println("\n----------- RECEIVE BOOK -----------");
                    System.out.print("Enter Member ID: ");
                    String returnMemberId = sc.nextLine();                    
                    System.out.print("Enter Book ID: ");
                    int returnBookId = sc.nextInt();
                    sc.nextLine();
                    
                    librarian.reciveBook(returnMemberId, returnBookId);
                    break;
                    
                case 6: // See borrowing history
                    System.out.println("\n----------- BORROWING HISTORY -----------");
                    System.out.print("Enter Member ID: ");
                    String historyMemberId = sc.nextLine();
                    
                    librarian.seeBorrowingHistory(historyMemberId);
                    break;
                    
                case 7: // Exit
                    System.out.println("\n****************************************");
                    System.out.println("Thank you for using the Library System!");
                    System.out.println("****************************************");
                    break;
                    
                default:
                    System.out.println("\nInvalid choice!");
            }
            
        } while (menuChoice != 7);
        
        sc.close();
    }
}