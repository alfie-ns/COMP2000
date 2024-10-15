package q1;

public class Book {
    private String title;
    private String author;
    private String year;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void printTitle() {
        System.out.println("Title: " + title);
    }

    public void printAuthor() {
        System.out.println("Author: " + author);
    }

    public void printYear() {
        System.out.println("Year: " + year);
    }
}