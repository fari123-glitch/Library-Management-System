import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManagementSystem lms = new LibraryManagementSystem();
        
        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Find Book by ID");
            System.out.println("4. Delete Book by ID");
            System.out.println("5. Add Library Member");
            System.out.println("6. Display All Members");
            System.out.println("7. Find Library Member by ID");
            System.out.println("8. Delete Library Member by ID");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    lms.addBook(bookId, title, author);
                    break;
                case 2:
                    lms.displayAllBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    String searchBookId = scanner.nextLine();
                    lms.findBook(searchBookId);
                    break;
                case 4:
                    System.out.print("Enter Book ID to Delete: ");
                    String deleteBookId = scanner.nextLine();
                    lms.deleteBook(deleteBookId);
                    break;
                case 5:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Member ID: ");
                    String memberId = scanner.nextLine();
                    System.out.print("Enter Membership Type: ");
                    String membershipType = scanner.nextLine();
                    lms.addMember(name, age, memberId, membershipType);
                    break;
                case 6:
                    lms.displayAllMembers();
                    break;
                case 7:
                    System.out.print("Enter Member ID to Search: ");
                    String searchMemberId = scanner.nextLine();
                    lms.findMember(searchMemberId);
                    break;
                case 8:
                    System.out.print("Enter Member ID to Delete: ");
                    String deleteMemberId = scanner.nextLine();
                    lms.deleteMember(deleteMemberId);
                    break;
                case 9:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
