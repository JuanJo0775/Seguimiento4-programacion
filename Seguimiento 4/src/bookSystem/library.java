package bookSystem;

import java.util.ArrayList;

public class library {
    private ArrayList<book> books;

    public library() {
        books = new ArrayList<>();
    }

    public void addBook(book book){
        books.add(book);
    }

    public void removeBook(String ISBN) {
        book bookToRemove = null;
        for (book book : books) {
            if (book.getISBN().equals(ISBN)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book with ISBN " + ISBN + " removed successfully!");
        } else {
            System.out.println("No book found with ISBN " + ISBN + ".");
        }
    }

    public book searchBookByTitle(String title) {
        for (book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<book> searchBookByAuthor(String author) {
        ArrayList<book> authorBooks = new ArrayList<>();
        for (book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }

    public void listBooks(){
        if(books.isEmpty()){
            System.out.println("The library is empty.");
        }else {
            for (book book : books) {
                System.out.println(book);
            }
        }
    }
}
