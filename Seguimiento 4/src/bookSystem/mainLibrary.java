package bookSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class mainLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        library library = new library();

        int option;
        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Search Book by Author");
            System.out.println("5. List All Books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Enter year of publication: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    book newBook = new book(title, author, ISBN, year);
                    library.addBook(newBook);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String isbnToRemove = scanner.nextLine();
                    library.removeBook(isbnToRemove);
                    System.out.println("Book removed successfully (if it existed)!");
                    break;

                case 3:
                    System.out.print("Enter book title to search: ");
                    String titleToSearch = scanner.nextLine();
                    book foundBook = library.searchBookByTitle(titleToSearch);
                    if (foundBook != null) {
                        System.out.println("Found Book: " + foundBook);
                    } else {
                        System.out.println("No book found with that title.");
                    }
                    break;

                case 4:
                    System.out.print("Enter author name to search: ");
                    String authorToSearch = scanner.nextLine();
                    ArrayList<book> authorBooks = library.searchBookByAuthor(authorToSearch);
                    if (!authorBooks.isEmpty()) {
                        System.out.println("Books by " + authorToSearch + ":");
                        for (book book : authorBooks) {
                            System.out.println(book);
                        }
                    } else {
                        System.out.println("No books found by that author.");
                    }
                    break;

                case 5:
                    library.listBooks();
                    break;

                case 6:
                    System.out.println("Exiting the library system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        } while (option != 6);

        scanner.close();
    }
}
