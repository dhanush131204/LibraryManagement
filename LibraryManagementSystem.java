// LibraryManagementSystem.java
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    registerUser();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    displayBooks();
                    break;
                case 6:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addBook() {
        System.out.print("Enter book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    private static void registerUser() {
        System.out.print("Enter user ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();

        users.add(new User(id, name));
        System.out.println("User registered successfully!");
    }

    private static void borrowBook() {
        System.out.print("Enter book ID to borrow: ");
        int bookId = scanner.nextInt();

        for (Book book : books) {
            if (book.getBookId() == bookId) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    private static void returnBook() {
        System.out.print("Enter book ID to return: ");
        int bookId = scanner.nextInt();

        for (Book book : books) {
            if (book.getBookId() == bookId) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    private static void displayBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            book.displayBookInfo();
        }
    }
}
