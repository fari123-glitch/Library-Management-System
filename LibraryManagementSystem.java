import java.util.*;

class LibraryManagementSystem {
    private List<LibraryMember> members;
    private List<Book> books;

    public LibraryManagementSystem() {
        this.members = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void addBook(String bookId, String title, String author) {
        Book book = new Book(bookId, title, author);
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found.");
        } else {
            for (Book book : books) {
                book.displayDetails();
                System.out.println("----------------------------");
            }
        }
    }

    public void findBook(String bookId) {
        boolean found = false;
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                book.displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + bookId + " not found.");
        }
    }

    public void deleteBook(String bookId) {
        Iterator<Book> iterator = books.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBookId().equals(bookId)) {
                iterator.remove();
                System.out.println("Book with ID " + bookId + " has been removed.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Book with ID " + bookId + " not found.");
        }
    }

    public void addMember(String name, int age, String memberId, String membershipType) {
        LibraryMember member = new LibraryMember(name, age, memberId, membershipType);
        members.add(member);
        System.out.println("Library member added successfully!");
    }

    public void displayAllMembers() {
        if (members.isEmpty()) {
            System.out.println("No members found.");
        } else {
            for (LibraryMember member : members) {
                member.displayDetails();
                System.out.println("----------------------------");
            }
        }
    }

    public void findMember(String memberId) {
        boolean found = false;
        for (LibraryMember member : members) {
            if (member.getMemberId().equals(memberId)) {
                member.displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Library member with ID " + memberId + " not found.");
        }
    }

    public void deleteMember(String memberId) {
        Iterator<LibraryMember> iterator = members.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            LibraryMember member = iterator.next();
            if (member.getMemberId().equals(memberId)) {
                iterator.remove();
                System.out.println("Library member with ID " + memberId + " has been removed.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Library member with ID " + memberId + " not found.");
        }
    }
}
