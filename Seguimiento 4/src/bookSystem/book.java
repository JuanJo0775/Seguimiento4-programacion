package bookSystem;

public class book {
    private String title;
    private String author;
    private String ISBN;
    private int yearOfPublication;

    public book(String title, String author, String ISBN, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "book" +
                "title= " + title + '\'' +
                ", author= " + author + '\'' +
                ", ISBN= " + ISBN + '\'' +
                ", yearOfPublication= " + yearOfPublication;
    }
}
