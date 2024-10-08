// Define the Book class
class Book {
    // Attributes
    String title;
    String author;
    String year;

    // Constructor to initialize the book attributes
    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to print the book title
    public void printTitle() {
        System.out.println("Title: " + title);
    }

    // Method to print the book author
    public void printAuthor() {
        System.out.println("Author: " + author);
    }

    // Method to print the publication year of the book
    public void printYear() {
        System.out.println("Year: " + year);
    }
}

public class q5 {
    public static void main(String[] args) {
        // Create an instance of the Book class
        Book book1 = new Book("1984", "George Orwell", "1949");

        // Call the methods to print the book details
        book1.printTitle();
        book1.printAuthor();
        book1.printYear();
    }
}